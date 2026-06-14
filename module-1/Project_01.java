// Frederick Costello
// CSD-402 Mod 1
// 14 June 2026
// Resources: Engineering Toolbox, OpenStax, Microsoft Word, Copilot

// Assignment Formula: 
// Q (Joules) = (Final temp - Initial Temp) X 4184
// Using water weight in Kilograms
// 



package com.mycompany.project_01;

import java.util.Scanner;

public class Project_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();
        System.out.print("Enter the initial temperature (°C): ");
        double initialTemperature = input.nextDouble();
        System.out.print("ENter the final temperature (°C): ");
        double finalTemperature = input.nextDouble();
        
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;
        
        System.out.println("The energy needed is " + Q + " Joules.");
    }
}