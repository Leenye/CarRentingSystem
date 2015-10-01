package com.imooc.ex2;

public class Truck extends Car{
    private int cargoCapacity;

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

    public void getCarInfo(){
        System.out.println("carLicense: " + this.getCarLicense() + " name: " + this.getName() +
                " cargoCapacity: " + this.getCargoCapacity() + " rent/day: " + this.getRent());
    }

}
