package com.imooc.ex2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){
        RentedCar rentedCar = new RentedCar();
        rentedCar.getCarMap().put("audiA4",1);
        rentedCar.getCarMap().put("pikaxue6", 2);

        int num = rentedCar.getTotalNum();
        float cost = rentedCar.getCost();
        System.out.println("total rented cars : "+num+"; total cost is: "+cost);
    }

}
