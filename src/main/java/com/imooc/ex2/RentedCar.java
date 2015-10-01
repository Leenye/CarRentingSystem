package com.imooc.ex2;
import java.util.*;
import java.util.stream.Stream;

public class RentedCar {
    Map<String,Integer> carMap = new HashMap<String, Integer>();
    private int totalNum;
    private float cost;
    List<Car> rentedCars = new ArrayList<Car>();

    public Map<String, Integer> getCarMap() {
        return carMap;
    }

    public int getTotalNum() {
        calculateTotalNum();
        return totalNum;

    }

    public float getCost() {
        calculateTotalCost();
        return cost;
    }

    public List<Car> getRentedCars() {
        getRentedCarsList();
        return rentedCars;
    }

    public void setRentedCars(List<Car> rentedCars) {
        this.rentedCars = rentedCars;
    }

    public void setCarMap(Map<String, Integer> carMap) {
        this.carMap = carMap;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    private void calculateTotalNum(){
        Iterator iterator = carMap.values().iterator();
        while (iterator.hasNext()){
            totalNum = totalNum + Integer.valueOf(iterator.next().toString());
        }
    }

    public float calculateTotalCost(){
        Set entries = carMap.entrySet();
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = entry.getKey().toString();
            float rent = getCarInfoByLicense(key).getRent();
            cost += (int)entry.getValue()*rent;
        }
        return cost;
//        entries.stream().forEach(entry -> {
//            Map.Entry mapEntry = (Map.Entry) entry;
//            float rent = getCarInfoByLicense(entry.toString()).getRent();
//            cost += (float)mapEntry.getValue()*rent;
//        });
//        return cost;
    }

    public Car getCarInfoByLicense(final String license) {
        for (Car car : AvailableCar.getAvailableCars()){
            if (car.getCarLicense().equals(license)){
                return car;
            }
        }
        return null;
//        return (Car) AvailableCar.getAvailableCars().stream().filter(car ->car.getCarLicense().equals(license));
    }

    private void getRentedCarsList(){
        Iterator iterator = carMap.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next().toString();
            Car  car = getCarInfoByLicense(key);
            rentedCars.add(car);
        }
    }



}
