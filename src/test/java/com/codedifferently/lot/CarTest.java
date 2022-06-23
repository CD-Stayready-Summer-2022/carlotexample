package com.codedifferently.lot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    @DisplayName("Car Constructor")
    public void constructorTest01(){
        Car car = new Car(Make.BMW, "E-30", "2023");
        Long expected = 1l;
        Long actual = car.getId();
        Assertions.assertEquals(expected, actual);
    }
}
