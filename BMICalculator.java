/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tester1;

/**
 *
 * @author scsacurom
 */
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms");
        
        Double weight = scan.nextDouble();
        
        System.out.println("Enter your Height in meters");
        
        Double Height = scan.nextDouble();
        
        Double bmi = weight/(Height * Height);
        
        System.out.printf("BMI: approimately \n %.2f%n", bmi);
    }
}
