package com.java.explore.java8;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Before Java 8, interfaces could have only public abstract methods. 
 * It was not possible to add new functionality to the existing interface without forcing all implementing classes to create an implementation of the new methods, 
 * nor it was possible to create interface methods with an implementation.
 */

public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
    
    static ZoneId getZoneId (String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString +
                "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }
    
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    }
}

class TimeClientImpl implements TimeClient {
	
	private LocalDateTime dateTime;
	
	

	public TimeClientImpl(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public void setTime(int hour, int minute, int second) {
		LocalDate from = LocalDate.from(dateTime);
		LocalTime time = LocalTime.of(hour, minute, second);
		this.dateTime=LocalDateTime.of(from, time);
	}

	public void setDate(int day, int month, int year) {
		LocalDate date = LocalDate.of(year, month, day);
		LocalTime time = LocalTime.from(dateTime);
		this.dateTime = LocalDateTime.of(date, time);
		
	}

	public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
		LocalDate date = LocalDate.of(year, month, day);
		LocalTime time = LocalTime.of(hour, minute, second);
		this.dateTime = LocalDateTime.of(date, time);
		
	}

	public LocalDateTime getLocalDateTime() {
		return dateTime;
	}
	
	public String toString() {
		System.err.println("ToString dateTime "+dateTime);
        return dateTime.toString();
    }
}

class Main {
	public static void main(String[] args) {
		TimeClient tc = new TimeClientImpl(LocalDateTime.now());
		
		tc.toString();
	}
}

