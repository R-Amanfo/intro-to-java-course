package com.cbfacademy.cars;

public class Car { 
    private String make;
    private String model;
    private int year;
    private String colour;

    public Car(String make, String model, String colour, int year){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getMake(String make) {
       return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
       return this.year;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDetails() {
        return "Car details: " + this.make + this.model + this.colour + this.year;
    }

    // Car volvo = new Car("volvo", "V40", "blue", 1942);
    // Car porsche = new Car("Porsche","Panamera", "red", 2000);

}

