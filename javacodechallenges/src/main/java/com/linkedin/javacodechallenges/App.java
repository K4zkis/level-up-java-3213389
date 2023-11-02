package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
                int measuriungUnitofGallons = 748;
        double pricePerMeasuringUnit = 3.90;
        int minimumGallonUsage = 2*measuriungUnitofGallons;
        double minimumPrice = 18.84;
        double priceToPay = 0;

        priceToPay = minimumPrice;
        

        if (gallonsUsage > minimumGallonUsage){
            gallonsUsage -= minimumGallonUsage;
            double amountOfUnitsUsed = gallonsUsage/measuriungUnitofGallons;
            double fullUnitsUsed = Math.round(amountOfUnitsUsed);

            priceToPay = addFractionalUnitUsed(pricePerMeasuringUnit, priceToPay, amountOfUnitsUsed);
            priceToPay += fullUnitsUsed*pricePerMeasuringUnit;
        }
        return (Math.round(priceToPay*100))/100.0;
        return 0;
    }

    private static double addFractionalUnitUsed(double pricePerMeasuringUnit, double priceToPay, double amountOfUnitsUsed) {
        if (amountOfUnitsUsed > Math.round(amountOfUnitsUsed)){
            priceToPay += pricePerMeasuringUnit;
        }
        return priceToPay;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
