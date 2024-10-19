package com.yash.carparking;

import java.util.Scanner;

public class CarParkingDemo {

    public static void main(String[] args) {
        CarParking carParking=new CarParking();
//        Scanner s=new Scanner(System.in);

        carParking.showAvailability();
        System.out.println();
        carParking.parkCar(new Car("MH12AB7863" ,"Divyaneee",101));
        carParking.parkCar(new Car("MH23DE8294","Prachi",102));
        carParking.parkCar(new Car("MP32GH3412","Vaishnavi",103));
        carParking.parkCar(new Car("UP21FG2312","Chaitali",104));
        carParking.parkCar(new Car("AP24FV2131","DD",105));

        System.out.println();

        carParking.showAvailability();

        System.out.println();
        carParking.getCar(101);

        System.out.println();

        carParking.showAvailability();

    }


}
