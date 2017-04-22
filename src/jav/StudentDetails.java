/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav;

import java.util.Scanner;


public class StudentDetails {
    public static void StuDetails() {
        Scanner input = new Scanner(System.in);
        StudentDatabase db = new StudentDatabase();
        
        System.out.print("Please Enter the Student's First Name : ");
        String fName = input.next();
        db.setFirstName(fName);
        
        System.out.print("Please Enter the Student's Last Name : ");
        String lName = input.next();
        db.setLastName(lName);
        
        System.out.print("Please Enter the Student's Student ID : ");
        String stuID = input.next();
        db.setStuID(stuID);
    }
}
