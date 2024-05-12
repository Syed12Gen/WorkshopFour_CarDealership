package com.ps;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Vehicle{vin=%d, year=%d, make='%s', model='%s', vehicleType='%s', color='%s', odometer=%d, price=%.2f}",
                vin, year, make, model, vehicleType, color, odometer, price);
    }
}