package com.java17.features.seal.light;

//Sealed class permits clause must contain all subclasses
//Class is not allowed to extend sealed class from another package
// Subclasses of the seales should be final,sealed or non sealed
public sealed interface TrafficLight permits RedLight, GreenLight {
}

final class RedLight implements TrafficLight {

}