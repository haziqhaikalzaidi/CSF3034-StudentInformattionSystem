/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity8;

/*******************************************************************************
 *Author: Muhamad Haziq Haikal Bin Zaidi
 *Matrix: S85722
 *Program Name:StudentProfile.java
 *Date: 28 October 2026
 *Modified Date: None
 *Version: 1.0
*******************************************************************************/

//declare public class name StudentInformationSystem
public class StudentInformationSystem {

    //declare main mathode
    public static void main(String[] args) {
        //Display student name and student ID
        String studentName = "Danial Jalmi"; 
        String studentID = "SU123456";
        
        System.out.println("=== Student Information System ===");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID  : " + studentID);
        System.out.println("---------------------------------");

        //Store two marks using variables
        double mark1 = 42.5;
        double mark2 = 45.0;

        //Calculate the total mark
        double totalMark = mark1 + mark2;

        //Display the total
        System.out.println("Mark 1     : " + mark1);
        System.out.println("Mark 2     : " + mark2);
        System.out.println("Total Mark : " + totalMark);

        //Display a message based on the total
        System.out.print("Result     : ");
        if (totalMark >= 80) {
            System.out.println("Excellent");
        } else if (totalMark >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
        System.out.println("=================================");
    }
    
}
