package com.codedifferently.lot;

import java.util.Objects;

public class Car {
    private static Long idCount = 1L;
    private Long id;
    private Make make;
    private String model;
    private String year;

    public Car(Make make, String model, String year) {
        this.id = idCount++;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && make == car.make && Objects.equals(model, car.model) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, year);
    }

    public String toString(){
        return String.format("%s %s %s", make.getName(), model, year);
    }
}
