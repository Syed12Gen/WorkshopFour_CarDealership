package com.ps;

import java.util.Scanner;
import java.util.List;

public class UserInterface {
    private Dealership dealership;

    // Constructor: Initializes the user interface.
    public UserInterface() {
        init();  // Initialize the dealership when the UserInterface is created.
    }

    // Initializes the dealership data by loading it from a file.
    private void init() {
        DealershipFileManager dfm = new DealershipFileManager();
        this.dealership = dfm.getDealership("vehicles.txt");  // Adjust the file name as needed.
    }

    // Display loop to handle user inputs.
    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the main menu
            System.out.println("\n1. Display all vehicles");
            System.out.println("2. Find vehicles within a price range");
            System.out.println("3. Find vehicles by make and model");
            System.out.println("4. Find vehicles by year range");
            System.out.println("5. Find vehicles by color");
            System.out.println("6. Find vehicles by mileage range");
            System.out.println("7. Find vehicles by type");
            System.out.println("8. Add a vehicle");
            System.out.println("9. Remove a vehicle");
            System.out.println("99. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    processAllVehiclesRequest();
                    break;
                case 2:
                    processGetByPriceRequest(scanner);
                    break;
                case 3:
                    processGetByMakeModelRequest(scanner);
                    break;
                case 4:
                    processGetByYearRequest(scanner);
                    break;
                case 5:
                    processGetByColorRequest(scanner);
                    break;
                case 6:
                    processGetByMileageRequest(scanner);
                    break;
                case 7:
                    processGetByVehicleTypeRequest(scanner);
                    break;
                case 8:
                    processAddVehicleRequest(scanner);
                    break;
                case 9:
                    processRemoveVehicleRequest(scanner);
                    break;
                case 99:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 99);

        scanner.close();
    }

    // Method to display all vehicles.
    private void processAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);  // Display all vehicles using the helper method
    }

    // Method to find vehicles within a specific price range.
    private void processGetByPriceRequest(Scanner scanner) {
    }

    // Method to find vehicles by make and model.
    private void processGetByMakeModelRequest(Scanner scanner) {
    }

    // Method to find vehicles by a range of years.
    private void processGetByYearRequest(Scanner scanner) {
    }

    // Method to find vehicles by color.
    private void processGetByColorRequest(Scanner scanner) {
    }

    // Method to find vehicles by mileage range.
    private void processGetByMileageRequest(Scanner scanner) {
    }

    // Method to find vehicles by type (Sedan, SUV, etc.).
    private void processGetByVehicleTypeRequest(Scanner scanner) {
    }

    // Method to add a new vehicle to the dealership.
    private void processAddVehicleRequest(Scanner scanner) {
    }

    // Method to remove a vehicle from the dealership.
    private void processRemoveVehicleRequest(Scanner scanner) {
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            System.out.println("\nListing All Vehicles:");
            System.out.println("| VIN    | Year | Make       | Model           | Type       | Color   | Odometer | Price      |");
            System.out.println("|--------|------|------------|-----------------|------------|---------|----------|------------|");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }
}