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
public class OfficeWorker extends Worker {

    public enum Rank{
        CASUAL, BOSS, MANAGER
    }
    private int workHours_weekly = 40;
    private Rank rank;
    
    public OfficeWorker(){
    
    }
    
    public OfficeWorker(String firstname, String surname, Sex sex, Rank rank) {
        super(firstname, surname, sex);
        this.rank = rank;
    }

    public OfficeWorker(String firstname, String surname, Sex sex, int telnumber, Rank rank) {
        super(firstname, surname, sex, telnumber);
        this.rank = rank;
    }

    public int getWorkHours_weekly() {
        return workHours_weekly;
    }

    public void setWorkHours_weekly(int workHours_weekly) {
        this.workHours_weekly = workHours_weekly;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    
}
