package com.ps;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Vehicle> purchasedVehicles;

    public User(String username) {
        this.username = username;
        this.purchasedVehicles = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addPurchasedVehicle(Vehicle vehicle) {
        purchasedVehicles.add(vehicle);
    }

    public List<Vehicle> getPurchasedVehicles() {
        return purchasedVehicles;
    }

    public void displayPurchasedVehicles() {
        if (purchasedVehicles.isEmpty()) {
            System.out.println(username + ", you have not purchased any vehicles.");
        } else {
            System.out.println(username + ", here are your purchased vehicles:");
            for (Vehicle vehicle : purchasedVehicles) {
                System.out.println(vehicle);
            }
        }
    }
}
