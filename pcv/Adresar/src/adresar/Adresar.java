/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adresar;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Radovan
 */
public class Adresar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cleaner cistic = new Cleaner ("Alois","Čistič",Worker.Sex.MAN,Cleaner.Position.GROUND);
        System.out.println("Pracovník: " + cistic.getFirstName()+ " " + cistic.getSurname());
        System.out.println("Pozice: "+cistic.getPosition()+" Pohlaví: "+ cistic.getSex());
        System.out.println("Počet pracovních hodin týdně: "+ cistic.getWorkHours_weekly());
        
        OfficeWorker urednik = new OfficeWorker("Hildegarda","Hetzlerová",Worker.Sex.WOMAN, OfficeWorker.Rank.MANAGER);
        Cleaner uklizec = new Cleaner ("Vlastimila","Čističová",Worker.Sex.WOMAN,Cleaner.Position.GROUND);
        Repairman udrzbar = new Repairman("Jiří","Opravář",Worker.Sex.MAN,Repairman.Focus.ELECTRICITY);
        
        List<Worker> pracovnici = new ArrayList<Worker>();
        pracovnici.add(urednik);
        pracovnici.add(uklizec);
        pracovnici.add(udrzbar);
        for (Worker pracovnik : pracovnici){
            System.out.println(pracovnik.ToString());
        }
    }
    
}
