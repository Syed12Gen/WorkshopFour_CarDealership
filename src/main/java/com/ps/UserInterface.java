package com.ps;

import java.util.Scanner;
import java.util.List;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
        init();  // Initialize the dealership when the UserInterface is created.
    }

    private void init() {
        // Initialize the dealership from the file.
        DealershipFileManager dfm = new DealershipFileManager();
        this.dealership = dfm.getDealership("vehicles.txt");  // Adjust the file name as needed.
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Displaying the main menu
            System.out.println("\n1. Display all vehicles");
            System.out.println("2. Add a vehicle (placeholder for future phases)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Process the user's choice
            switch (choice) {
                case 1:
                    // Display all vehicles in the dealership
                    processAllVehiclesRequest();
                    break;
                case 2:
                    // Placeholder for adding a vehicle
                    System.out.println("Adding a vehicle is not implemented yet.");
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private void processAllVehiclesRequest() {
        System.out.println("\nListing All Vehicles:");
        System.out.println("| VIN    | Year | Make       | Model           | Type       | Color   | Odometer | Price      |");
        System.out.println("|--------|------|------------|-----------------|------------|---------|----------|------------|");
       for (Vehicle vehicle : dealership.getAllVehicles()) {
            System.out.println(vehicle);
        }
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles are available.");
        } else {
            System.out.println("\nListing All Vehicles:");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);  // Ensure Vehicle.toString() is overridden appropriately.
            }
        }
    }
}