/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Racheal Lubangakene
 */

public class returnJournyTime {
    
    public static void main(String[] args) {
    int totalDistance = 10000;
    int speed = 250;
    int refuelStops = totalDistance / 200;
    int stopTime = refuelStops * 5;
    int travelTime = (totalDistance / speed) * 60 + stopTime;
    System.out.println("Total travel time for return journey: " + travelTime + " minutes");
    }
    }