package com.ps;

import java.io.*;
import java.util.ArrayList;

public class DealershipFileManager {
    public Dealership getDealership(String filename) {
        Dealership dealership = new Dealership("Default Dealership", "Unknown Address", "N/A");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                // Skip comments, empty lines, and the vehicle header line
                if (line.startsWith("#") || line.trim().isEmpty() || line.trim().startsWith("VIN")) continue;

                if (firstLine) {
                    // Parse dealership information
                    String[] dealershipInfo = line.split("\\|");
                    if (dealershipInfo.length >= 3) {
                        dealership = new Dealership(
                                dealershipInfo[0].trim(),
                                dealershipInfo[1].trim(),
                                dealershipInfo[2].trim()
                        );
                    }
                    firstLine = false;
                } else {
                    // Parse vehicle information
                    String[] data = line.split("\\|");
                    if (data.length == 8) {
                        Vehicle vehicle = new Vehicle(
                                Integer.parseInt(data[0].trim()),
                                Integer.parseInt(data[1].trim()),
                                data[2].trim(),
                                data[3].trim(),
                                data[4].trim(),
                                data[5].trim(),
                                Integer.parseInt(data[6].trim()),
                                Double.parseDouble(data[7].trim())
                        );
                        dealership.addVehicle(vehicle);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing integer: " + e.getMessage());
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership, String filename) {
        // Method for saving the dealership data back to the file
    }
}
