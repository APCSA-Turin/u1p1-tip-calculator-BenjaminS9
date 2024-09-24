package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        
        //Finds the exact cost of tip
        double tip = cost * (percent / 100.0);
        
        //Finds the cost of the bill with tip
        double totalCost = cost + tip;
        
        //Finds the total amount that each person needs to pay including bill and tip rounded to the nearest hundredths
        double totalCostPerPerson = totalCost / people;
        totalCostPerPerson = Math.round(totalCostPerPerson * 100);
        totalCostPerPerson /= 100;

        //Rounds the cost of the total bill with tip to the nearest hundredths
        totalCost = Math.round(totalCost * 100);
        totalCost /= 100;

        //Rounds the cost of the tip to the nearest hundredths
        tip = Math.round(tip * 100); //Found out how to use Math.round from here: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round
        tip /= 100;
        
        //Finds the cost of the bill before tip that each person would need to pay rounded to the nearest hundrdths
        double billCostPerPerson = cost / people; 
        billCostPerPerson = Math.round(billCostPerPerson * 100);
        billCostPerPerson /= 100;

        //Finds the amount of tip each person would need to pay rounded to the nearest hundrdths
        double tipPerPerson = tip / people;
        tipPerPerson = Math.round(tipPerPerson * 100);
        tipPerPerson /= 100;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + totalCost + "\n");
        result.append("Per person cost before tip: $" + billCostPerPerson + "\n");
        result.append("Tip per person: $" + tipPerPerson + "\n");
        result.append("Total cost per person: $" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
