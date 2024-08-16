/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class SecondCoachArrivalTime {
    
    public static void main(String[] args) {
        
        int totalDistance = 10000;
        double speed = 225.5; 
        int startTime = 9 * 60; 
        int travelTime = (int) (totalDistance / (speed * 60)); 
        int arrivalTime = startTime + travelTime;
        System.out.println("Arrival time: " + arrivalTime / 60 + ":" + arrivalTime % 60);
    }
}
