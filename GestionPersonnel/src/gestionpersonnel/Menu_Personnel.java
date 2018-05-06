/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author jonathan detrier
 */
public class Menu_Personnel extends javax.swing.JFrame {

    private PersonnelDAO p = new PersonnelDAO();
    private TableRowSorter<TableModel> sorter;
    private String id = null;
    
    /**
     * Creates new form Menu_Personnel
     */
    public Menu_Personnel() throws IOException, ParseException {
        initComponents();
        if (!PersonnelDAO.hasloadP) 
            p.recupererPersonnels();
        if (!PersonnelDAO.hasloadC)
            p.recupererCompetencesPersonnels();
        recupererDonnees();
        this.sorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        personnel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        competences = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mission = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mssm = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        listeP = new javax.swing.JTextField();
        listePers = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        listeS = new javax.swing.JLabel();
        listeSkills = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        bSupprimer = new javax.swing.JButton();
        bModifier = new javax.swing.JButton();
        bAjouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion du personnel");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        sidePanel.setBackground(new java.awt.Color(74, 35, 68));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personnel.setBackground(new java.awt.Color(153, 62, 97));
        personnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personnelMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_User_Account_15px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Personnel");

        javax.swing.GroupLayout personnelLayout = new javax.swing.GroupLayout(personnel);
        personnel.setLayout(personnelLayout);
        personnelLayout.setHorizontalGroup(
            personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        personnelLayout.setVerticalGroup(
            personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        sidePanel.add(personnel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        competences.setBackground(new java.awt.Color(116, 54, 92));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Development_Skill_15px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Compétences");

        javax.swing.GroupLayout competencesLayout = new javax.swing.GroupLayout(competences);
        competences.setLayout(competencesLayout);
        competencesLayout.setHorizontalGroup(
            competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(competencesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        competencesLayout.setVerticalGroup(
            competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(competencesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel.add(competences, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 50));

        mission.setBackground(new java.awt.Color(116, 54, 92));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Task_15px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Missions");

        javax.swing.GroupLayout missionLayout = new javax.swing.GroupLayout(mission);
        mission.setLayout(missionLayout);
        missionLayout.setHorizontalGroup(
            missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        missionLayout.setVerticalGroup(
            missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel.add(mission, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 50));

        mssm.setBackground(new java.awt.Color(74, 35, 68));
        mssm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mssmMouseClicked(evt);
            }
        });
        mssm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("M");
        mssm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 32, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("S");
        mssm.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 33, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("S");
        mssm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 30, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("M");
        mssm.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 33, 30));

        sidePanel.add(mssm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 140));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Liste du personnel");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Chercher un employé :");
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        listeP.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        listeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listePActionPerformed(evt);
            }
        });
        listeP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listePKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listePKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listePKeyTyped(evt);
            }
        });
        body.add(listeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 20, 100, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom", "Prenom", "Date d'entrée", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        listePers.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nom");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Prenom");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Date d'entrée");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Id");
        }

        body.add(listePers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 469, 440));

        listeS.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        listeS.setText("Compétences de l'employé");
        body.add(listeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 16, 189, -1));

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        listeSkills.setViewportView(jList1);

        body.add(listeSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 51, 250, 281));

        bSupprimer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bSupprimer.setText("Supprimer");
        bSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSupprimerActionPerformed(evt);
            }
        });
        body.add(bSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        bModifier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bModifier.setText("Modifier");
        bModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifierActionPerformed(evt);
            }
        });
        body.add(bModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        bAjouter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAjouter.setText("Ajouter");
        bAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjouterActionPerformed(evt);
            }
        });
        body.add(bAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listePActionPerformed

    private void bModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifierActionPerformed
        try {
            Modify_Employe ae = new Modify_Employe(this, true, this.id);
            ae.setVisible(true);
            recupererDonnees();
        } catch (IOException ex) {
            Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bModifierActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            recupererCompetencesPersonnel();
        } catch (IOException ex) {
            Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void listePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listePKeyTyped
        
    }//GEN-LAST:event_listePKeyTyped

    private void listePKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listePKeyPressed
        
    }//GEN-LAST:event_listePKeyPressed

    private void listePKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listePKeyReleased
        String text = listeP.getText();
        if (text.length() == 0) {
          sorter.setRowFilter(null);
        } else {
          sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_listePKeyReleased

    private void bAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjouterActionPerformed
        try {
            System.out.println(PersonnelDAO.personnels.size());
            Add_Employe ae = new Add_Employe(this, true);
            ae.setVisible(true);
            addLine();
            System.out.println(PersonnelDAO.personnels.size());
        } catch (IOException ex) {
            Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bAjouterActionPerformed

    private void bSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSupprimerActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (this, "Voulez-vous réellement supprimer l'employé " + jTable1.getValueAt(jTable1.getSelectedRow(), 1) + " " + jTable1.getValueAt(jTable1.getSelectedRow(), 0) +"?","Attention", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                removeLine();
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Sélectionnez une, et une seule, ligne pour supprimer un enregistrement.", "Erreur : Aucune sélection", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bSupprimerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        SaveAllChanges s = new SaveAllChanges();
        int r = JOptionPane.showConfirmDialog(this, "Voulez-vous sauvegarder avant de quitter ? (Toute modification non sauvegardée sera perdue)");
        if (r == 0) {
            try {
                s.saveChanges();
            } catch (IOException ex) {
                Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (r == 2) {
            try {
                Menu_Personnel m = new Menu_Personnel();
                m.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_formWindowClosing

    private void personnelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personnelMouseClicked
        try {
            this.dispose();
            new Menu_Personnel().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_personnelMouseClicked

    private void mssmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mssmMouseClicked
        Accueil accueil = new Accueil();
        dispose();
        accueil.setVisible(true);
    }//GEN-LAST:event_mssmMouseClicked
    
    public void addLine() {
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        Object[] toAdd = new Object[4];
        if ( (int) tbm.getValueAt(tbm.getRowCount()-1, tbm.getColumnCount()-1) != PersonnelDAO.personnels.get(PersonnelDAO.personnels.size()-1).getId()) {
            toAdd[0] = PersonnelDAO.personnels.get(PersonnelDAO.personnels.size()-1).getName();
            toAdd[1] = PersonnelDAO.personnels.get(PersonnelDAO.personnels.size()-1).getPrenom();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            toAdd[2] = df.format(PersonnelDAO.personnels.get(PersonnelDAO.personnels.size()-1).getDateE());
            toAdd[3] = PersonnelDAO.personnels.get(PersonnelDAO.personnels.size()-1).getId();
            tbm.addRow(toAdd);
            jTable1.setModel(tbm);
        }
    }
    
    public void removeLine() {
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        int toDel = jTable1.getSelectedRow();
        id = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        Personnel perso = null;
        for (Personnel p : PersonnelDAO.personnels) {
            if (p.getId() == Integer.parseInt(id)) {
                perso = p;
            }
        }
        PersonnelDAO.personnels.remove(perso);
        tbm.removeRow(toDel);
        jTable1.setModel(tbm);
    }
    
    public void recupererDonnees() throws IOException, ParseException {
        Object[][] data = new Object[PersonnelDAO.personnels.size()][4];
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for (int i=0; i < PersonnelDAO.personnels.size(); i++) {
            data[i][0] = PersonnelDAO.personnels.get(i).getName();
            data[i][1] = PersonnelDAO.personnels.get(i).getPrenom();
            String dateE = df.format(PersonnelDAO.personnels.get(i).getDateE());
            data[i][2] = dateE;
            data[i][3] = PersonnelDAO.personnels.get(i).getId();
        }
        String[] header = new String[] {"Nom", "Prenom", "Date d'entrée", "Id"};
        DefaultTableModel tbm = new DefaultTableModel(data, header);
        jTable1.setModel(tbm);
    }

    public void recupererCompetencesPersonnel() throws IOException, ParseException {
        id = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        Vector<String> model = new Vector<>();
        for (Personnel p : PersonnelDAO.personnels) {
            if (p.getId() == Integer.parseInt(id)) {
                for (Competence c : p.competences) {
                    model.add(c.getName());
                }
            }
        }
        jList1.setListData(model);
    }
    
    
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
            java.util.logging.Logger.getLogger(Menu_Personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Personnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu_Personnel().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Menu_Personnel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAjouter;
    private javax.swing.JButton bModifier;
    private javax.swing.JButton bSupprimer;
    private javax.swing.JPanel body;
    private javax.swing.JPanel competences;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField listeP;
    private javax.swing.JScrollPane listePers;
    private javax.swing.JLabel listeS;
    private javax.swing.JScrollPane listeSkills;
    private javax.swing.JPanel mission;
    private javax.swing.JPanel mssm;
    private javax.swing.JPanel personnel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
