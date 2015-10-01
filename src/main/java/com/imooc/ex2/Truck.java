package com.imooc.ex2;

public class Truck extends Car{
    private String carLicense;
    private String name;
    private int cargoCapacity;
    private float rent;

    public Truck(String carLicense, String name, int cargoCapacity, float rent) {
        this.carLicense = carLicense;
        this.name = name;
        this.cargoCapacity = cargoCapacity;
        this.rent = rent;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
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
