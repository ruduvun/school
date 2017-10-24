/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.awt.Color;

/**
 * Třída Human
 * 
 */
public class Human {
    // Vlastní výčtový typ
    public enum Sex {
        MAN, WOMAN
    }
    // Atributy třídy
    private String name;
    private int age = 20;
    private int weight = 70;
    private float height = (float) 1.80;
    private Sex sex = Sex.MAN;
    
    /* Modifikátor zabraňuje veřejnému přístupu k atributu, ale ten je
     * přístupný pro všechny potomky třídy Human */
    protected Color eyes = Color.BLUE;
    
    
    /* Metody třídy Human */
    // Konstruktor třídy Human
    public Human(String jmeno){
        this.name = jmeno;
    }
    
    public Human(String jmeno, int age, Sex sex){
        this.name = jmeno;
        this.setAge(age);
        this.setSex(sex);
    }
    
    /* Getters a Setters */
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        if(age > 0 && age < 130)
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    public double getBMI(){
        return Math.round(this.weight / Math.pow(this.height,2)*100.0)/100.0;
    }
    
    @Override
    public String toString(){
        String output = this.name + " [Human]";
        /*output += "I'm "+ this.getAge() +" years old.\n";
        output += "My height is "+ this.getHeight()+"m and my weight is "+this.getWeight()+" kg.\n";
        output += "BMI: "+getBMI()+"\n";*/
        return output;
    }
}
