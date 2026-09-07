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

public class WeightedFinalGrade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your quiz grade: ");
            Double quiz = scan.nextDouble();
         
        System.out.println("Enter your project grade: ");
            Double project = scan.nextDouble();
        
        System.out.println("Enter your exam grade: ");
            Double exam = scan.nextDouble();
            
        Double fquiz = quiz * 0.30;
        Double fproject = project * 0.30;
        Double fexam = exam * 0.40;
        
        Double result = fquiz + fproject + fexam;
        
        System.out.println("Final Grade: " + result);
    }
          
}
