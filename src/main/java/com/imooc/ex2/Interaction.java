package com.imooc.ex2;

import java.util.Scanner;

public class Interaction {
    private RentedCar rentedCar = new RentedCar();
    Scanner scannerInput = new Scanner(System.in);

    public void interact() {
        System.out.println("welcome to dada car renting system.\r would you like to rent a car? \n " +
                "press \"y \" to continue, and \"n \" to quit");
        String start = scannerInput.next();
        if (start.equals("y")) {
            printAllAvailableCars();
            rentingProcess();
        }
        scannerInput.close();
    }

    private void printAllAvailableCars() {
        System.out.println("***********************************");
        System.out.println("All the available cars:");
        for (Car car : AvailableCar.getAvailableCars()) {
            if (car instanceof PassengerCar) {
                System.out.println("carLicense: " + car.getCarLicense() + " name: " + car.getName() +
                        " passengers: " + ((PassengerCar) car).getPassengerCapacity() + " rent/day: " + car.getRent());
            }
            if (car instanceof Truck) {
                System.out.println("carLicense: " + car.getCarLicense() + " name: " + car.getName() +
                        " cargoCapacity: " + ((Truck) car).getCargoCapacity() + " rent/day: " + car.getRent());
            }
            if (car instanceof Pickup) {
                System.out.println("carLicense: " + car.getCarLicense() + " name: " + car.getName() + " passengers: " + ((Pickup) car).getPassengerCapacity() +
                        " cargoCapacity: " + ((Pickup) car).getCargoCapacity() + " rent/day: " + car.getRent());
            }
        }
        System.out.println("**********************************");
    }

    private void rentingProcess() {
        System.out.println("how many cars do you want to rent? ");
        int carNum = scannerInput.nextInt();

        rentedCar.setTotalNum(carNum);

        System.out.println("please input carLicense of the car you want to rent:");
        for (int i = 1; i <= carNum; i++) {
            System.out.println("please input the No."+i +" car");
            String carLicense = scannerInput.next();
            Car carToRent = rentedCar.getCarInfoByLicense(carLicense);
            if (carToRent != null) {
                System.out.println("please input the days you want to rent: ");
                int rentDays = scannerInput.nextInt();
                rentedCar.getCarMap().put(carLicense, rentDays);
                System.out.println("successfully rent " + carLicense + " for " + rentDays + " days");
            } else {
                System.out.println("wrong carLicense number, please check your input, and input again");
                i -= 1;
            }
        }
        System.out.println("you've finished the renting process");
        System.out.println("***********************************");
        System.out.println("You rented " + rentedCar.getTotalNum() + " car. The total cost is " + rentedCar.getCost());
        System.out.println( "Thank you for your coming");
    }


}
