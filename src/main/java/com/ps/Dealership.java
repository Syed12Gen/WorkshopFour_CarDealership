package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    // Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();  // Instantiate the ArrayList
    }

    // Method to add a vehicle to the inventory
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // Method to get all vehicles in the inventory
    public ArrayList<Vehicle> getAllVehicles() {
        return new ArrayList<>(inventory); // Return a copy of the inventory list
    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

    // Stub methods - They should eventually be implemented properly

    // Return null as a placeholder for now
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }


    public List<Vehicle> getVehiclesByMake(String make) {
        return null;
    }

    public List<Vehicle> getVehiclesByModel(String model) {
        return null;
    }

    public List<Vehicle> getVehiclesByVin(int vin) {
        return null;
    }

    public List<Vehicle> getVehiclesByPrice(double price) {
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int year) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int mileage) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String type) {
        return null;
    }

}

