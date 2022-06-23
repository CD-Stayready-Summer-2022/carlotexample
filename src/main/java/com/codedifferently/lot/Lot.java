package com.codedifferently.lot;

import java.util.HashMap;
import java.util.Map;

public class Lot {
    private String name;
    private Map<String, Integer> inventory;

    public Lot(String name){
        this.name = name;
        this.inventory = new HashMap<>();
    }

    public Lot(String name, Map<String, Integer> inventory){
        this.name = name;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCar(Car car){
        String carName = car.toString();
        if(inventory.containsKey(carName)){
            Integer currentCount = inventory.get(carName) + 1;
            inventory.put(carName, currentCount);
        }else {
            inventory.put(carName, 1);
        }
    }

    public Integer getCarCount(Car car){
        return inventory.get(car.toString());
    }


}
