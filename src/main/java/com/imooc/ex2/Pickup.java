package com.imooc.ex2;

public class Pickup extends Car {
    private int passengerCapacity;
    private float cargoCapacity;

    public Pickup(String carLicense, String name, int passengerCapacity, float cargoCapacity, float rent) {
        this.carLicense = carLicense;
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.rent = rent;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCargoCapacity(float cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void getCarInfo() {
        System.out.println("carLicense: " + this.getCarLicense() + " name: " + this.getName() + " passengers: " + this.getPassengerCapacity() +
                " cargoCapacity: " + this.getCargoCapacity() + " rent/day: " + this.getRent());
    }

}
