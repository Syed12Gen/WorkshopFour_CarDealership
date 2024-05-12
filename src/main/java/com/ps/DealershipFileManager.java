package com.ps;

import java.io.*;
import java.util.ArrayList;

public class DealershipFileManager {
    public Dealership getDealership(String filename) {

        Dealership dealership = new Dealership();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 8) {
                    Vehicle vehicle = new Vehicle (
                        Integer.parseInt(data[0]),
                        Integer.parseInt(data[1]),
                        data[2],
                        data[3],
                        data[4],
                        data[5],
                        Integer.parseInt(data[6]),
                        Double.parseDouble(data[7])
                    );
                    dealership.addVehicle(vehicle);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership, String filename) {

    }
}
