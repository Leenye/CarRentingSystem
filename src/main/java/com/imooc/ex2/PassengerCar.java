package com.imooc.ex2;

public class PassengerCar extends Car {
    private int passengerCapacity;
    private float cargoCapacity;
    private String name;
    private String carLicense;
    private float rent;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCar(String carLicense, String name, int passengerCapacity, float rent) {
        this.carLicense = carLicense;
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.rent = rent;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCarLicense() {
        return carLicense;
    }

    @Override
    public float getRent() {
        return rent;
    }

    public void setCargoCapacity(float cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }
}
