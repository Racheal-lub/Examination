/*
 * Click to change this license
 

/**
 *
 * @author Racheal Lubangakene
 */

public class TelecomBilling {
    public static void main(String[] args) {
        double airtimeLoaded = 10000; 
        double callDuration = 5; 
        double callRate = 200; 

        double billingCharge = airtimeLoaded * 0.1; 
        double callCharge = callDuration * 60 * callRate; 

        double balance = airtimeLoaded - billingCharge - callCharge;

        System.out.println("Balance: " + balance + " UGX");
    }
}

