/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciselne.soustavy;

/**
 *
 * @author student
 */
public class CiselneSoustavy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Ciselne soustavy");
            System.out.println("-------------------------------");
            int x = Integer.parseInt(args[0]);
            System.out.format("DEC: %d%n",x);
            System.out.format("HEX: %x%n",x);
            System.out.format("OCT: %o%n",x);
            System.out.format("BIN: %s%n",Integer.toBinaryString(x));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally{
            System.out.println("-------------------------------");
            System.out.println("The End");
        }
    }
    
}
