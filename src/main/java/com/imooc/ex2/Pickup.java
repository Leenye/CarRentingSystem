package com.imooc.ex2;

public class Pickup extends Car{
    private int passengerCapacity;
    private float cargoCapacity;

    public Pickup(String carLicense,String name, int passengerCapacity, float cargoCapacity, float rent) {
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

    @Override
    public String getCarLicense() {
        return carLicense;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getRent() {
        return rent;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }
}
