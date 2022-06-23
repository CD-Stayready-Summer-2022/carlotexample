package com.codedifferently.lot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LotTest {

    @Test
    @DisplayName("Constructor Test")
    public void constructorTest01(){
        Lot lot = new Lot("Daniel's Discount Cars");
        String expected = "Daniel's Discount Cars";
        String actual = lot.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Add Car to inventory test")
    public void addCarTest01(){
        Lot lot = new Lot("Too Many Cars");
        Car car = new Car(Make.INFINITI, "Q 50", "2018");
        lot.addCar(car);
        Integer expected = 1;
        Integer actual = lot.getCarCount(car);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Add Car to inventory test")
    public void addCarTest02(){
        Lot lot = new Lot("Too Many Cars");
        Car car = new Car(Make.INFINITI, "Q 50", "2018");
        Car car2 = new Car(Make.INFINITI, "Q 50", "2018");
        lot.addCar(car);
        lot.addCar(car);
        lot.addCar(car2);
        Integer expected = 3;
        Integer actual = lot.getCarCount(car);
        Assertions.assertEquals(expected, actual);
    }
}
