package com.codedifferently.lot;

public enum Make {
    DODGE("Dodge"), BMW("Bmw"), CADLIAC("Cadliac"), MERCEDES("Mercedes"), INFINITI("Infiniti");
    private String name;
    Make(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
