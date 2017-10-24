/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author student
 */
public class Sportsman extends Human {
    private int energy = 15000;
    private double steroids = 0;
    
    public Sportsman(String jmeno) {
        super(jmeno);     
    }
    
    public Sportsman(String jmeno, int energy) {
        super(jmeno);
        this.energy = energy;
        
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public double getSteroids() {
        return steroids;
    }

    public void setSteroids(double steroids) {
        this.steroids = steroids;
    }

    @Override
    public String toString() {
        return super.toString() + " [Sportsman]";
    }
    
    
}
