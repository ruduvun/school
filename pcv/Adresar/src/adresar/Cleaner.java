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
public class Cleaner extends Worker {
    public enum Position{
        GROUND,FIRST_FLOOR,SECOND_FLOOR
    }
    private int workHours_weekly = 25;
    private Position position;
    
    public Cleaner(){
    
    }
    
    public Cleaner(String firstname, String surname, Sex sex, Position position) {
        super(firstname, surname, sex);
        this.setPosition(position);
    }

    public Cleaner(String firstname, String surname, Sex sex, int telnumber, Position position) {
        super(firstname, surname, sex, telnumber);
        this.setPosition(position);
    }

    public int getWorkHours_weekly() {
        return workHours_weekly;
    }

    public void setWorkHours_weekly(int workHours_weekly) {
        this.workHours_weekly = workHours_weekly;
    }
    
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
}
