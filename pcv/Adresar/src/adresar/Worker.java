/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adresar;

/**
 *
 * @author Radovan
 */
public class Worker {

    
    public enum Sex{
        MAN, WOMAN
    }
    private String firstName;
    private String surname;
    private Sex sex;
    private int age = 25;
    private int telnumber = 777666555;
    private String address = "Opavská 5";
    private String zip = "746 01";
    private String city = "Opava";
    
    public Worker (){
        
    }
    
    public Worker(String firstname, String surname){
        this.firstName = firstname;
        this.surname = surname;
    }
    
    public Worker (String firstname, String surname, Sex sex){
        this.firstName = firstname;
        this.surname = surname;
        this.setSex(sex);
    }
    public Worker (String firstname, String surname, Sex sex, int telnumber){
        this.firstName = firstname;
        this.surname = surname;
        this.setSex(sex);
        this.telnumber = telnumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getTelnumber() {
        return telnumber;
    }

    public String getAddress() {
        return address;
    }

    public String getZip() {
        return zip;
    }

    public Sex getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setTelnumber(int telnumber) {
        this.telnumber = telnumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

<<<<<<< HEAD
=======
    public String getCity() {
        return city;
    }

>>>>>>> 27960631b470af392153dd009811ccaac6c08105
    public void setCity(String city) {
        this.city = city;
    }
    
    public String ToString(){
        String output = this.firstName + " [Worker]";
        return output;
    }
    
}
