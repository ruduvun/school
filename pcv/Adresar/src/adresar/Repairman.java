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
public class Repairman extends Worker {
    public enum Focus{
        COMPUTERS, ELECTRICITY, OTHER
    }
    private Focus focus;
    private int workHours_weekly = 20;
    
    public Repairman(){
    
    }
    
    public Repairman(String firstname, String surname, Sex sex,Focus focus) {
        super(firstname, surname, sex);
        this.focus = focus;
    }

    public Repairman(String firstname, String surname, Sex sex, int telnumber, Focus focus) {
        super(firstname, surname, sex, telnumber);
        this.focus = focus;
    }

    public Focus getFocus() {
        return focus;
    }

    public void setFocus(Focus focus) {
        this.focus = focus;
    }

    public int getWorkHours_weekly() {
        return workHours_weekly;
    }

    public void setWorkHours_weekly(int workHours_weekly) {
        this.workHours_weekly = workHours_weekly;
    }

    
    
    
}
