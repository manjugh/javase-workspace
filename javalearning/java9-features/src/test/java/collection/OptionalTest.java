package collection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalLong;

public class OptionalTest {

    /**
     * ifPresentOrElse, or, Nullable
     */
    @Test
    @DisplayName("Testing Optional.or method with valid value")
    void OptionalOr_whenValidValid_returnInputValue(){
        Optional<String> value = Optional.of("Value");
        Optional<String> aDefault = value.or(() -> Optional.of("default"));
        Assertions.assertThat(aDefault).isEqualTo(value);
    }

    @Test
    @DisplayName("Testing Optional.or method with null value")
    void OptionalOr_whenNullInput_returnInputValue(){
        Optional<String> value = Optional.ofNullable(null);
        Optional<String> aDefault = value.or(() -> Optional.of("default"));
        Assertions.assertThat(aDefault).isEqualTo(Optional.of("default"));
    }

    @Test
    void ifPresentorElse_whenNon_nullValue(){
        Employee employee = new Employee();
        Optional<LocalDate> now = Optional.of(LocalDate.now());
        //if present print the actual value or some other default action to be taken
        now.ifPresentOrElse((date) -> employee.testDate = date,() -> System.out.println("Displaying default value 2020"));
        Assertions.assertThat(employee.testDate).isEqualTo(now.get());
    }


    @Test
    void ifPresentorElse_whennullValue(){
        Employee employee = new Employee();
        Optional<LocalDate> now = Optional.ofNullable(null);
        //if present print the actual value or some other default action to be taken
        now.ifPresentOrElse((date) -> employee.testDate = date,() -> employee.testDate=LocalDate.now().minusDays(2));
        Assertions.assertThat(employee.testDate).isEqualTo(LocalDate.now().minusDays(2));
    }

    class Employee {
        public LocalDate testDate;
    }
}
