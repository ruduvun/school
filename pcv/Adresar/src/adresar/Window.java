/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adresar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Radovan
 */
public class Window extends javax.swing.JFrame {
    String[] columns = {"Jméno","Přijmení","Pohlaví","Tel. číslo","Adresa","Město","PSČ"};
    DefaultTableModel model_officeworker = new DefaultTableModel(columns, 0);
    DefaultTableModel model_repairman = new DefaultTableModel(columns, 0);
    DefaultTableModel model_cleaner = new DefaultTableModel(columns, 0);
    String vyber;
    
    /**
     * Creates new form Window
     */
    public Window() {    
        initComponents();
        officeWorkerTable.setModel(model_officeworker);
        
        repairmanTable.setModel(model_repairman);
        cleanerTable.setModel(model_cleaner);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
<<<<<<< HEAD
        editMenu = new javax.swing.JMenuItem();
        removeMenu = new javax.swing.JMenuItem();
=======
        removeMenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenuItem();
>>>>>>> 27960631b470af392153dd009811ccaac6c08105
        jLabel1 = new javax.swing.JLabel();
        addButt = new javax.swing.JButton();
        saveButt = new javax.swing.JButton();
        loadButt = new javax.swing.JButton();
        zalozky = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        officeWorkerTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        repairmanTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        cleanerTable = new javax.swing.JTable();

<<<<<<< HEAD
        editMenu.setText("Editovat...");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });
        popupMenu.add(editMenu);

        removeMenu.setText("Odstranit vybrané");
        removeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMenuActionPerformed(evt);
            }
        });
        popupMenu.add(removeMenu);
=======
        removeMenu.setText("Odstranit vybraný");
        removeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMenuActionPerformed(evt);
            }
        });
        popupMenu.add(removeMenu);

        editMenu.setText("Editovat...");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });
        popupMenu.add(editMenu);
>>>>>>> 27960631b470af392153dd009811ccaac6c08105

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adresář firmy");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Adresář firmy");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButt.setText("Přidat zaměstnance");
        addButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtActionPerformed(evt);
            }
        });

        saveButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveButt.setText("Uložit tabulku");
        saveButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtActionPerformed(evt);
            }
        });

        loadButt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadButt.setText("Načíst tabulku");
        loadButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtActionPerformed(evt);
            }
        });

        officeWorkerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        officeWorkerTable.setComponentPopupMenu(popupMenu);
        jScrollPane1.setViewportView(officeWorkerTable);

        zalozky.addTab("Úředníci", jScrollPane1);

        repairmanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        repairmanTable.setComponentPopupMenu(popupMenu);
        jScrollPane3.setViewportView(repairmanTable);

        zalozky.addTab("Údržbáři", jScrollPane3);

        cleanerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        cleanerTable.setComponentPopupMenu(popupMenu);
        jScrollPane4.setViewportView(cleanerTable);

        zalozky.addTab("Uklízeči", jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zalozky)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                        .addComponent(saveButt)
                        .addGap(42, 42, 42)
                        .addComponent(loadButt)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButt)
                    .addComponent(loadButt)
                    .addComponent(addButt))
                .addGap(53, 53, 53)
                .addComponent(zalozky, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtActionPerformed
        Worker worker = new Worker();
        String pohlavi;
        addDialog dialog = new addDialog(this,true,worker);
        /*dialog.addConfirmListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){*/
                Worker vytvoreny = dialog.getWorker();
                System.out.println(vytvoreny.getSex());
                if(vytvoreny.getSex() == Worker.Sex.MAN){
                    pohlavi = "Muž";
                }
                else{
                    pohlavi = "Žena";
                }
                vyber = dialog.getClassname();
            if("urednici".equals(vyber)){
                model_officeworker.addRow(new Object[]{vytvoreny.getFirstName(),vytvoreny.getSurname(),pohlavi,vytvoreny.getTelnumber(),vytvoreny.getAddress(),vytvoreny.getCity(),vytvoreny.getZip()});
            }
            else if("udrzbari".equals(vyber)){
                model_repairman.addRow(new Object[]{vytvoreny.getFirstName(),vytvoreny.getSurname(),pohlavi,vytvoreny.getTelnumber(),vytvoreny.getAddress(),vytvoreny.getCity(),vytvoreny.getZip()});
            }
            else{
                model_cleaner.addRow(new Object[]{vytvoreny.getFirstName(),vytvoreny.getSurname(),pohlavi,vytvoreny.getTelnumber(),vytvoreny.getAddress(),vytvoreny.getCity(),vytvoreny.getZip()});
            }
            //}
        //});
        
    }//GEN-LAST:event_addButtActionPerformed

    private void saveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtActionPerformed

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("adresar.txt"))){
            bw.write("class;firstname;surname;sex;telnumber;address;city;zip");
            
            for (int i = 0; i < model_officeworker.getRowCount();i++){
                bw.newLine();
                bw.write("officeworker;");
                for(int j = 0; j < model_officeworker.getColumnCount();j++){
                    bw.write(model_officeworker.getValueAt(i, j).toString());
                    if(j != model_cleaner.getColumnCount() - 1)
                        bw.write(";");
                }
            }
            for (int i = 0; i < model_repairman.getRowCount();i++){
                bw.newLine();
                bw.write("repairman;");
                for(int j = 0; j < model_repairman.getColumnCount();j++){
                    bw.write(model_repairman.getValueAt(i, j).toString());
                    if(j != model_cleaner.getColumnCount() - 1)
                        bw.write(";");
                }
            }
            for (int i = 0; i < model_cleaner.getRowCount();i++){
                bw.newLine();
                bw.write("cleaner;");
                for(int j = 0; j < model_cleaner.getColumnCount();j++){
                    bw.write(model_cleaner.getValueAt(i, j).toString());
                    if(j != model_cleaner.getColumnCount() - 1)
                        bw.write(";");
                }
            }
            bw.flush();
        }
        catch (Exception e){
            System.err.println("Do souboru se nepovedlo zapsat.");
        }
    }//GEN-LAST:event_saveButtActionPerformed

    private void loadButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtActionPerformed
        try (BufferedReader br = new BufferedReader(new FileReader("adresar.txt"))){
            for(int i = 0;i < model_officeworker.getRowCount();i++){
                model_officeworker.removeRow(i);
            }
            for(int i = 0;i < model_repairman.getRowCount();i++){
                model_repairman.removeRow(i);
            }
            for(int i = 0;i < model_cleaner.getRowCount();i++){
                model_cleaner.removeRow(i);
            }
            String pohlavi;
            String s;
            int i = 0;
            while ((s = br.readLine()) != null){
                
                if(i > 0){
                    String[] attr = s.split(";");
                    Worker pracovnik;
                    if(attr[0].equals("officeworker")){
                        pracovnik = new Worker(attr[1],attr[2]);
                        pohlavi = attr[3];
                        pracovnik.setTelnumber(Integer.parseInt(attr[4]));
                        pracovnik.setAddress(attr[5]);
                        pracovnik.setCity(attr[6]);
                        pracovnik.setZip(attr[7]);
                        model_officeworker.addRow(new Object[]{pracovnik.getFirstName(),pracovnik.getSurname(),pohlavi,pracovnik.getTelnumber(),pracovnik.getAddress(),pracovnik.getCity(),pracovnik.getZip()});
                    }
                    else if(attr[0].equals("repairman")){
                        pracovnik = new Worker(attr[1],attr[2]);
                        pohlavi = attr[3];
                        pracovnik.setTelnumber(Integer.parseInt(attr[4]));
                        pracovnik.setAddress(attr[5]);
                        pracovnik.setCity(attr[6]);
                        pracovnik.setZip(attr[7]);
                        model_repairman.addRow(new Object[]{pracovnik.getFirstName(),pracovnik.getSurname(),pohlavi,pracovnik.getTelnumber(),pracovnik.getAddress(),pracovnik.getCity(),pracovnik.getZip()});
                    }
                    else if(attr[0].equals("cleaner")){
                        pracovnik = new Worker(attr[1],attr[2]);
                        pohlavi = attr[3];
                        pracovnik.setTelnumber(Integer.parseInt(attr[4]));
                        pracovnik.setAddress(attr[5]);
                        pracovnik.setCity(attr[6]);
                        pracovnik.setZip(attr[7]);
                        model_cleaner.addRow(new Object[]{pracovnik.getFirstName(),pracovnik.getSurname(),pohlavi,pracovnik.getTelnumber(),pracovnik.getAddress(),pracovnik.getCity(),pracovnik.getZip()});
                    }
                }
                i++;
            }
        }
        catch (Exception e){
            System.err.println("Chyba při čtení ze souboru.");
        }
    }//GEN-LAST:event_loadButtActionPerformed

<<<<<<< HEAD
    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        String recordvalues = "";
        String pohlavi;
        if(zalozky.getTitleAt(zalozky.getSelectedIndex()).equals("Úředníci") && officeWorkerTable.getSelectedRow() > -1){
            String type = "urednik";
            final int selectedRowIndex = officeWorkerTable.getSelectedRow();
            Worker pracovnik = new Worker();
            pracovnik.setFirstName(recordvalues + (String.valueOf(model_officeworker.getValueAt(selectedRowIndex,0))));         
            pracovnik.setSurname(recordvalues + (String.valueOf(model_officeworker.getValueAt(selectedRowIndex,1))));
            if((recordvalues + (String.valueOf(model_officeworker.getValueAt(selectedRowIndex,2)))).equals("Muž")){
                pracovnik.setSex(Worker.Sex.MAN);
                pohlavi = "Muž";
            }
            else{
                pracovnik.setSex(Worker.Sex.WOMAN);
                pohlavi = "Žena";
            }
            
            pracovnik.setTelnumber((int)model_officeworker.getValueAt(selectedRowIndex,3));
            pracovnik.setAddress(recordvalues + (String.valueOf(model_officeworker.getValueAt(selectedRowIndex,4))));
            pracovnik.setCity(recordvalues + (String.valueOf(model_officeworker.getValueAt(selectedRowIndex,5))));
            pracovnik.setZip(recordvalues + (String.valueOf(model_officeworker.getValueAt(selectedRowIndex,6))));
            addDialog dialog = new addDialog(this,true,pracovnik,type);
            officeWorkerTable.setModel(model_officeworker);
        }
        else if(zalozky.getTitleAt(zalozky.getSelectedIndex()).equals("Údržbáři") && repairmanTable.getSelectedRow() > -1){
            String type = "udrzbar";            
            final int selectedRowIndex = repairmanTable.getSelectedRow();
            Worker pracovnik = new Worker();
            String pomocna = String.valueOf(model_repairman.getValueAt(selectedRowIndex, 0));
            pracovnik.setFirstName(recordvalues + (String.valueOf(model_repairman.getValueAt(selectedRowIndex,0))));
            
            pracovnik.setSurname(recordvalues + (String.valueOf(model_repairman.getValueAt(selectedRowIndex,1))));
            if(recordvalues + (String.valueOf(model_repairman.getValueAt(selectedRowIndex,2))) == "Muž"){
                pracovnik.setSex(Worker.Sex.MAN);
                pohlavi = "Muž";
            }
            else{
                pracovnik.setSex(Worker.Sex.WOMAN);
                pohlavi = "Žena";
            }
            
            pracovnik.setTelnumber((int)model_repairman.getValueAt(selectedRowIndex,3));
            pracovnik.setAddress(recordvalues + (String.valueOf(model_repairman.getValueAt(selectedRowIndex,4))));
            pracovnik.setCity(recordvalues + (String.valueOf(model_repairman.getValueAt(selectedRowIndex,5))));
            pracovnik.setZip(recordvalues + (String.valueOf(model_repairman.getValueAt(selectedRowIndex,6))));
            addDialog dialog = new addDialog(this,true,pracovnik,type);
        }
        else{
            String type = "uklizec";
            final int selectedRowIndex = cleanerTable.getSelectedRow();
            Worker pracovnik = new Worker();
            String pomocna = String.valueOf(model_cleaner.getValueAt(selectedRowIndex, 0));
            pracovnik.setFirstName(recordvalues + (String.valueOf(model_cleaner.getValueAt(selectedRowIndex,0))));
            
            pracovnik.setSurname(recordvalues + (String.valueOf(model_cleaner.getValueAt(selectedRowIndex,1))));
            if(recordvalues + (String.valueOf(model_cleaner.getValueAt(selectedRowIndex,2))) == "Muž"){
                pracovnik.setSex(Worker.Sex.MAN);
                pohlavi = "Muž";
            }
            else{
                pracovnik.setSex(Worker.Sex.WOMAN);
                pohlavi = "Žena";
            }
            
            pracovnik.setTelnumber((int)model_cleaner.getValueAt(selectedRowIndex,3));
            pracovnik.setAddress(recordvalues + (String.valueOf(model_cleaner.getValueAt(selectedRowIndex,4))));
            pracovnik.setCity(recordvalues + (String.valueOf(model_cleaner.getValueAt(selectedRowIndex,5))));
            pracovnik.setZip(recordvalues + (String.valueOf(model_cleaner.getValueAt(selectedRowIndex,6))));
            addDialog dialog = new addDialog(this,true,pracovnik,type);
            
        }
    }//GEN-LAST:event_editMenuActionPerformed

    private void removeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMenuActionPerformed
        if(zalozky.getTitleAt(zalozky.getSelectedIndex()).equals("Úředníci")){
            int[] rows = officeWorkerTable.getSelectedRows();
            for(int i=0;i<rows.length;i++){
                model_officeworker.removeRow(rows[i]-i);
            }
        }
        else if(zalozky.getTitleAt(zalozky.getSelectedIndex()).equals("Údržbáři")){
            int[] rows = repairmanTable.getSelectedRows();
            for(int i=0;i<rows.length;i++){
                model_repairman.removeRow(rows[i]-i);
            }
        }
        else{
            int[] rows = cleanerTable.getSelectedRows();
            for(int i=0;i<rows.length;i++){
                model_cleaner.removeRow(rows[i]-i);
            }
        }
    }//GEN-LAST:event_removeMenuActionPerformed
    
    public void setTable(Worker pracovnik, String pohlavi,int selectedRowIndex){
        model_officeworker.setValueAt(pracovnik.getFirstName(),selectedRowIndex,0);
        model_officeworker.setValueAt(pracovnik.getSurname(),selectedRowIndex,1);
        model_officeworker.setValueAt(pracovnik.getFirstName(),selectedRowIndex,2);
        model_officeworker.setValueAt(pohlavi, selectedRowIndex,3);
        model_officeworker.setValueAt(pracovnik.getTelnumber(), selectedRowIndex,4);
        model_officeworker.setValueAt(pracovnik.getAddress(), selectedRowIndex,5);
        model_officeworker.setValueAt(pracovnik.getCity(), selectedRowIndex,6);
        model_officeworker.setValueAt(pracovnik.getZip(), selectedRowIndex,7);
    }
=======
    private void removeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeMenuActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        /*if (officeWorkerTable.getSelectedRow() > -1){
            Worker pracovnik = (Worker) model.get(peopleList.getSelectedIndex());
            addDialog dialog = new addDialog(this,true,pracovnik);
            model.setElementAt(dialog.getPerson(), peopleList.getSelectedIndex());
            
        }*/
    }//GEN-LAST:event_editMenuActionPerformed

>>>>>>> 27960631b470af392153dd009811ccaac6c08105
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButt;
    private javax.swing.JTable cleanerTable;
    private javax.swing.JMenuItem editMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton loadButt;
    private javax.swing.JTable officeWorkerTable;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenuItem removeMenu;
    private javax.swing.JTable repairmanTable;
    private javax.swing.JButton saveButt;
    private javax.swing.JTabbedPane zalozky;
    // End of variables declaration//GEN-END:variables
}
