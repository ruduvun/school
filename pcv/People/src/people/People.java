/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Human student = new Human("Hugo", 18, Human.Sex.MAN);
        //student.setAge(18);
        student.setWeight(72);
        //student.setHeight(72);
        //System.out.println(student.toString());
        Human studentka = new Human("Hilda", 17, Human.Sex.WOMAN);
        studentka.setAge(17);
        //studentka.setSex(Human.Sex.WOMAN);
        studentka.setWeight(55);
        student.setHeight(1.75f);
        //System.out.println(studentka.toString());
        Hockeyplayer sportovec = new Hockeyplayer("Jarda",20000);
        sportovec.setAge(45);
        sportovec.setHeight(1.89f);
        sportovec.setWeight(102);
        sportovec.setGoals(50);
        sportovec.setAssists(20);
        //System.out.println(sportovec.toString());
        
        List<Human> lide = new ArrayList<Human>();
        lide.add(student);
        lide.add(studentka);
        lide.add(sportovec);
        
        for (Human clovek : lide){
            System.out.println(clovek.toString());
        }
    }
    
}
