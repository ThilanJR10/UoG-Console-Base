/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class BinaryFileHandle {

    File file = new File("FirstClass.txt");
    Marks marks = new Marks();
    StudentDatabase db = new StudentDatabase();

    public void OutputFirstClass(ArrayList<Marks> obj) throws Exception {

        Marks student = new Marks();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);

        oos.flush();
        oos.close();
        fos.close();

    }

    public void InputFirstClass(ArrayList<Marks> obj) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("");
        System.out.println("    LIST OF STUDENTS WITH FIRST CLASS HONOURS    ");
        System.out.println("");

        try {
            while (true) {
                Marks student1 = (Marks) ois.readObject();
                System.out.println(student1);
            }
        } catch (EOFException e) {

        }
        for (Marks m : obj) {
            marks = m;

            if ((marks.getLevel4Credits() + marks.getLevel4Credits() + marks.getLevel4Credits()) >= 360) {
                if (marks.getIndicatorScore() >= 70) {
                    System.out.println("Index No : " + db.getStuID() + "Name : " + db.getFirstName() 
                            + " " + db.getLastName());

                }
            }  else {
                    System.out.println("Oops! No one has First Classes");
                    System.out.println("");
                }
        }

    }

}
