package com.imooc.ex2;

public abstract class Car {
    protected String name;
    protected float rent;
    protected String carLicense;

    public String getName() {
        return name;
    }

    public float getRent() {
        return rent;
    }

    public String getCarLicense() {
        return carLicense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    public abstract void getCarInfo();
}
