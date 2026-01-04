package com.Practice;

interface Vehicle{
    public String MyCar();
    default void MyBike() {
        System.out.println("This is My New Bike");
    }
    public static void MyBicycle() {
        System.out.println("This is My Old Bicycle ");
    }
}

public class Practice {
    public static void main(String[] args) {

        Vehicle vehicle = () -> "This is My new Car";
        vehicle.MyBike();
        Vehicle.MyBicycle();
        System.out.println(vehicle.MyCar());

    }
}
