/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav;

/**
 *
 * @author Thilan
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Level05_Level06 {

    private static int creditsLevel05;

    public static void marksLevel05() {

        ArrayList<Integer> obj = new ArrayList<Integer>();
        Marks student = new Marks();
        Scanner sc = new Scanner(System.in);
        Level06 level06 = new Level06();

        System.out.println("WELCOME TO LEVEL 05");
        System.out.println("");
        //Module01 getting marks
        System.out.print("Enter module 1,ICT 01 :");
        int Mod1ICT01 = sc.nextInt();
        obj.add(Mod1ICT01);
        System.out.print("Enter module 1,ICT 02 :");
        int Mod1ICT02 = sc.nextInt();
        obj.add(Mod1ICT02);
        System.out.print("Enter module 1,ICT 03 :");
        int Mod1ICT03 = sc.nextInt();
        obj.add(Mod1ICT03);
        //Module01 Calculate average
        int totalM01 = obj.get(0) + obj.get(1) + obj.get(2);
        System.out.println("Total mark of 1st module :" + totalM01);
        int avg1 = totalM01 / 3;
        //storing the module 01 average
        student.setModule1L5(avg1);
        System.out.println("Average total of 1st module :" + student.getModule1L4());
        //Status for module01
        if (avg1 >= 40) {
            System.out.println("You have Passed the module & got 20 credits ");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else if (avg1 < 40 && avg1 >= 30) {
            System.out.println("Module will be Condoned and passed & got 20 credits");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else {
            System.err.println("Re-sit Module");
        }

        //Module02 getting marks
        System.out.println("");
        System.out.print("Enter module 2,ICT 01 :");
        int Mod2ICT01 = sc.nextInt();
        obj.add(Mod2ICT01);
        System.out.print("Enter module 2,ICT 02 :");
        int Mod2ICT02 = sc.nextInt();
        obj.add(Mod2ICT02);
        System.out.print("Enter module 2,ICT 03 :");
        int Mod2ICT03 = sc.nextInt();
        obj.add(Mod2ICT03);
        //Module02 Calculate average
        int totalM02 = obj.get(3) + obj.get(4) + obj.get(5);
        System.out.println("Total mark of 2nd module :" + totalM02);
        int avg2 = totalM02 / 3;
        //storing the module 02 average
        student.setModule2L5(avg2);
        System.out.println("Average total of 2nd module :" + student.getModule2L5());
        //Status for module02
        if (avg2 >= 40) {
            System.out.println("You have Passed the module & got 20 credits ");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else if (avg2 < 40 && avg2 >= 30) {
            System.out.println("Module will be Condoned and passed & got 20 credits");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else {
            System.err.println("Re-sit Module");
        }

        //Module03 getting marks
        System.out.println("");
        System.out.print("Enter module 3,ICT 01 :");
        int Mod3ICT01 = sc.nextInt();
        obj.add(Mod3ICT01);
        System.out.print("Enter module 3,ICT 02 :");
        int Mod3ICT02 = sc.nextInt();
        obj.add(Mod3ICT02);
        System.out.print("Enter module 3,ICT 03 :");
        int Mod3ICT03 = sc.nextInt();
        obj.add(Mod3ICT03);
        //Module03 Calculate average
        int totalM03 = obj.get(6) + obj.get(7) + obj.get(8);
        System.out.println("Total mark of 3rd module :" + totalM03);
        int avg3 = totalM03 / 3;
        //storing the module 03 average
        student.setModule3L5(avg3);
        System.out.println("Average total of 3rd module :" + student.getModule3L5());
        //Status for module03
        if (avg3 >= 40) {
            System.out.println("You have Passed the module & got 20 credits ");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else if (avg3 < 40 && avg3 >= 30) {
            System.out.println("Module will be Condoned and passed & got 20 credits");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else {
            System.err.println("Re-sit Module");
        }

        //Module04 getting marks
        System.out.println("");
        System.out.print("Enter module 4,ICT 01 :");
        int Mod4ICT01 = sc.nextInt();
        obj.add(Mod4ICT01);
        System.out.print("Enter module 4,ICT 02 :");
        int Mod4ICT02 = sc.nextInt();
        obj.add(Mod1ICT02);
        System.out.print("Enter module 4,ICT 03 :");
        int Mod4ICT03 = sc.nextInt();
        obj.add(Mod4ICT03);
        //Module04 Calculate average
        int totalM04 = obj.get(9) + obj.get(10) + obj.get(11);
        System.out.println("Total mark of 4th module :" + totalM04);
        int avg4 = totalM04 / 3;
        //storing the module 04 average
        student.setModule4L5(avg4);
        System.out.println("Average total of 4th module :" + student.getModule4L5());
        //Status for module04
        if (avg4 >= 40) {
            System.out.println("You have Passed the module & got 20 credits ");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else if (avg4 < 40 && avg4 >= 30) {
            System.out.println("Module will be Condoned and passed & got 20 credits");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else {
            System.err.println("Re-sit Module");
        }

        //Module05 getting marks
        System.out.println("");
        System.out.print("Enter module 5,ICT 01 :");
        int Mod5ICT01 = sc.nextInt();
        obj.add(Mod5ICT01);
        System.out.print("Enter module 5,ICT 02 :");
        int Mod5ICT02 = sc.nextInt();
        obj.add(Mod5ICT02);
        System.out.print("Enter module 5,ICT 03 :");
        int Mod5ICT03 = sc.nextInt();
        obj.add(Mod5ICT03);
        //Module05 Calculate average
        int totalM05 = obj.get(12) + obj.get(13) + obj.get(14);
        System.out.println("Total mark of 5th module :" + totalM05);
        int avg5 = totalM05 / 3;
        //storing the module 05 average
        student.setModule5L5(avg5);
        System.out.println("Average total of 5th module :" + student.getModule5L5());
        //Status for module05
        if (avg5 >= 40) {
            System.out.println("You have Passed the module & got 20 credits ");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else if (avg5 < 40 && avg5 >= 30) {
            System.out.println("Module will be Condoned and passed & got 20 credits");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else {
            System.err.println("Re-sit Module");
        }

        //Module06 getting marks
        System.out.println("");
        System.out.print("Enter module 6,ICT 01 :");
        int Mod6ICT01 = sc.nextInt();
        obj.add(Mod6ICT01);
        System.out.print("Enter module 6,ICT 02 :");
        int Mod6ICT02 = sc.nextInt();
        obj.add(Mod6ICT02);
        System.out.print("Enter module 6,ICT 03 :");
        int Mod6ICT03 = sc.nextInt();
        obj.add(Mod6ICT03);
        //Module06 Calculate average
        int totalM06 = obj.get(15) + obj.get(16) + obj.get(17);
        System.out.println("Total mark of 6th module :" + totalM06);
        int avg6 = totalM06 / 3;
        //storing the module 06 average
        student.setModule6L5(avg6);
        System.out.println("Average total of 6th module :" + student.getModule6L5());
        //Status for module06
        if (avg6 >= 40) {
            System.out.println("You have Passed the module & got 20 credits ");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else if (avg6 < 40 && avg6 >= 30) {
            System.out.println("Module will be Condoned and passed & got 20 credits");
            student.setLevel5Credits(creditsLevel05 += 20);
        } else {
            System.err.println("Re-sit Module");
        }
        
        //Displaying the total Credits the student got
        System.out.println("");
        System.out.println("The student has received " + student.getLevel5Credits() + " Credits in Level 05\n"
                + "And "+(student.getLevel4Credits()+student.getLevel5Credits())+" in Total");
        
        if(student.getLevel4Credits()==120 && student.getLevel5Credits()==120){
            System.out.println("");
            System.out.println("The Student is Eligible for Level 06");
            System.out.println("");
            level06.marksLevel06();
        }else if(student.getLevel4Credits()==120 && student.getLevel5Credits()==100){
            System.out.println("");
            System.out.println("The Student is Eligible for Level 06");
            System.out.println("");
            level06.marksLevel06();
        }else{
            System.out.println("");
            System.out.println("Sorry! The Student is Not Eligible for Level 06");
        }
       
    }
}
