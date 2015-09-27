package com.imooc.ex2;

public class Truck extends Car{
    private String name;
    private int cargoCapacity;
    private float rent;

    public Truck(String name, int cargoCapacity, float rent) {
        this.name = name;
        this.cargoCapacity = cargoCapacity;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public float getRent() {
        return rent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }
}
