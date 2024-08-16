/*
 * Click to change this license
 * 

/**
 *
 * @author Racheal Lubangakene
 */

public class BabyMealScheduler {
    public static void main(String[] args) {
        double porridgeVolume = 2; 
        double milkVolume = 2; 
        double cupSize = 0.5; 

        int porridgeFeedingTime = 45; 
        int milkFeedingTime = 30;

        int totalPorridgeFeedings = (int) (porridgeVolume / cupSize);
        int totalMilkFeedings = (int) (milkVolume / cupSize);

        int totalPorridgeTime = totalPorridgeFeedings * porridgeFeedingTime;
        int totalMilkTime = totalMilkFeedings * milkFeedingTime;

        int totalTime = totalPorridgeTime + totalMilkTime;

        System.out.println("Total time to finish both porridge and milk: " + totalTime + " minutes");
    }
}

