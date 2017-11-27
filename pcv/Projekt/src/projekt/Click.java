/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

/**
 *
 * @author Radovan
 */
public class Click extends Window {
    private int clicks = 0;
    //private int clickIncome = 0;
    
    public Click (int clicks){
        clicks = this.clicks;
        //clickIncome = this.clickIncome;
    }
    
    public int getClicks (){
        return clicks;
    }
    
    public void setClicks(int clicks){
        this.clicks = clicks;
    }
    
}
