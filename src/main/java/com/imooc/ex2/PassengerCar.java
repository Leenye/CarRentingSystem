package com.imooc.ex2;

public class PassengerCar extends Car {
    private String name;
    private int passengerCapacity;
    private float rent;

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public float getRent() {
        return rent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }

    public PassengerCar(String name, int passengerCapacity, float rent) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.rent = rent;
    }

    public PassengerCar() {
    }

}
