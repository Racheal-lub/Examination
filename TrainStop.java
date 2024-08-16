/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
public class TrainStop {

    public static void main(String[] args) {
       
 
        int totalDistance = 10000;
        int stopDistance = 150;
        int refuelDistance = 200;
        int stops = (totalDistance / stopDistance) + (totalDistance / refuelDistance);
        System.out.println("Number of stops: " + stops);
    }
}
