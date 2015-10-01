package com.imooc.ex2;

public class PassengerCar extends Car {
    private int passengerCapacity;

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

    @Override
    public void getCarInfo() {
        System.out.println("carLicense: " + this.getCarLicense() + " name: " + this.getName() +
                " passengers: " + this.getPassengerCapacity() + " rent/day: " + this.getRent());
    }
}
