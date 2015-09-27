package com.imooc.ex2;

public class Pickup extends Car{
    private String name;
    private int passengerCapacity;
    private float cargoCapacity;
    private float rent;

    public Pickup(String name, int passengerCapacity, float cargoCapacity, float rent) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
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

    public void setCargoCapacity(float cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }
}
