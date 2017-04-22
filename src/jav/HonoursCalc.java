/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class HonoursCalc {
    public static int CalculateHonours(int indicatorScore) {
        Marks marks = new Marks();
        //Creating and array list to store the module marks
        ArrayList<Integer> modAvg = new ArrayList<Integer>();
        
        modAvg.add(marks.getModule1L5());
        modAvg.add(marks.getModule2L5());
        modAvg.add(marks.getModule3L5());
        modAvg.add(marks.getModule4L5());
        modAvg.add(marks.getModule5L5());
        modAvg.add(marks.getModule6L5());

        modAvg.add(marks.getModule1L6());
        modAvg.add(marks.getModule2L6());
        modAvg.add(marks.getModule3L6());
        modAvg.add(marks.getModule4L6());
        modAvg.add(marks.getModule5L6());
        modAvg.add(marks.getModule6L6());
        //Find the sum of averages
        int sumAvg = modAvg.get(0)+modAvg.get(1)+modAvg.get(2)+modAvg.get(3)+modAvg.get(4)+modAvg.get(5)
                +modAvg.get(6)+modAvg.get(7)+modAvg.get(8)+modAvg.get(9)+modAvg.get(10)+modAvg.get(11);
        //Sorting the arraylist 
        Collections.sort(modAvg);
        
        indicatorScore = (sumAvg-modAvg.get(0))/11;
        marks.setIndicatorScore(indicatorScore);
        
        return indicatorScore;
    }
}
