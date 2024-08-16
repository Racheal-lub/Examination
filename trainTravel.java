/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class trainTravel {
    
    public static void main(String[]args){
    int totalDistance = 10000;
        int speed = 250;
        int stops = (totalDistance / 150) + (totalDistance / 200);
        int stopTime = stops * 5; 
        int travelTime = (totalDistance / speed) * 60 + stopTime;
        System.out.println("Total travel time: " + travelTime + " minutes");
        
    }
    
}
