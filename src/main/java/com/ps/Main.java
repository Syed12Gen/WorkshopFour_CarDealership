package com.ps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Welcome to Mavericks Motors!");

        // ASCII art for display in console
        String asciiSportsCar = """
                                                                    
                                                                  ,----------------,              ,-------------,
                                                            _.-="   _- [Syed]     | ||""\"""\""---._______     __..
                                                ___.===""\""-.______-,,,,,,,,,,,,`-''----" ""\"""       ""\"""  __'
                                         __.--""     __        ,'                   o \\           __        [__|
                                    __-""=======.--""  ""--.=================================.--""  ""--.=======:
                                   ]            : /        \\ : |========================|    : /        \\ :    [---------------- 
                                   S___________:|          |: |========================|    :|          |:   _-"
                                    S__________: \\        / :_|=======================/_____: \\        / :__-"
                                    -----------'  "-____-"  `-------------------------------'  "-____-
                """;
        System.out.println(asciiSportsCar);

        // Create dealership and add vehicles
        Dealership dealership = new Dealership("Mavericks Motors", "1234 Elm Street", "555-1234");
        Vehicle vehicle1 = new Vehicle(1, 2021, "Toyota", "Corolla", "Sedan", "Red", 0, 20000);
        Vehicle vehicle2 = new Vehicle(2, 2022, "Honda", "Civic", "Sedan", "Blue", 0, 18000);
        Vehicle vehicle3 = new Vehicle(3, 2023, "Ford", "Mustang", "Coupe", "Black", 0, 25000);

        dealership.addVehicle(vehicle1);
        dealership.addVehicle(vehicle2);
        dealership.addVehicle(vehicle3);

        // Retrieve and display all vehicles
        ArrayList<Vehicle> allVehicles = dealership.getAllVehicles();
        for (Vehicle vehicle : allVehicles) {
            System.out.println(vehicle);
        }

        System.out.println("\n Thank you for visiting Mavericks Motors!");
    }
}