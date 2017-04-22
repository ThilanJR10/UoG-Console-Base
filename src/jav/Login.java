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
import java.util.Scanner;

public class Login {

    private static String Login;

    public static void Login(int access) {
        Level04 level04 = new Level04();
        String UserName;
        String PassWord;
        Scanner sc = new Scanner(System.in);
        do {
            
            System.out.print("Enter UserName : ");
            UserName = sc.next();

            System.out.print("Enter PassWord : ");
            PassWord = sc.next();

            if (UserName.equals("user") && PassWord.equals("gugsi")) {
                access = 1;
                System.out.println("\nWellCome to University of Gugsi");
                level04.marksLevel04();
                //System.out.println("access" + access);
            } else {
                access = 0;
                System.err.println("\nUserName and PassWord Invalid");

            }
        } while (access == 0);

    }

}
