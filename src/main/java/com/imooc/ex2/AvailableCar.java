package com.imooc.ex2;

import java.util.ArrayList;
import java.util.List;

public class AvailableCar {
    static List<Car> AVAILABLE_CARS = new ArrayList<Car>();

    public static List<Car> getAvailableCars() {
        Car audiA4 = new PassengerCar("001", "audiA4", 4, 500);
        Car mazida6 = new PassengerCar("010", "mazida6", 4, 400);
        Car pikaxue6 = new Pickup("011", "pikaxue6", 4, 2, 450);
        Car jinlong = new PassengerCar("100", "jinlong", 20, 800);
        Car songhuajiang = new Truck("101", "songhuajiang", 4, 400);
        Car yiweike = new Truck("110", "yiweike", 20, 1000);
        AVAILABLE_CARS.add(audiA4);
        AVAILABLE_CARS.add(mazida6);
        AVAILABLE_CARS.add(pikaxue6);
        AVAILABLE_CARS.add(jinlong);
        AVAILABLE_CARS.add(songhuajiang);
        AVAILABLE_CARS.add(yiweike);
        return AVAILABLE_CARS;
    }

    public void setAvailableCars(List<Car> availableCars) {
        AVAILABLE_CARS = availableCars;
    }

}
