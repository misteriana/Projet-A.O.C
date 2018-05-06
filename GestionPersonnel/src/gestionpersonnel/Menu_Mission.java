/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel;

import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *<b> Cette interface affiche les différentes missions </b>
 * @author cedric greufeille
 */
public class Menu_Mission extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Mission
     */
    public Menu_Mission() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel2 = new javax.swing.JPanel();
        personnel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        competences = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mission = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mssm = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        listeP = new javax.swing.JTextField();
        listePers = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        listeS = new javax.swing.JLabel();
        listeSkills = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        bModifier = new javax.swing.JButton();
        bAjouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(991, 540));
        setResizable(false);

        sidePanel2.setBackground(new java.awt.Color(74, 35, 68));
        sidePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personnel2.setBackground(new java.awt.Color(116, 54, 92));
        personnel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personnel2MouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_User_Account_15px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Personnel");

        javax.swing.GroupLayout personnel2Layout = new javax.swing.GroupLayout(personnel2);
        personnel2.setLayout(personnel2Layout);
        personnel2Layout.setHorizontalGroup(
            personnel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        personnel2Layout.setVerticalGroup(
            personnel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personnel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        sidePanel2.add(personnel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        competences.setBackground(new java.awt.Color(116, 54, 92));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Development_Skill_15px.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(153, 62, 97));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Compétences");

        javax.swing.GroupLayout competencesLayout = new javax.swing.GroupLayout(competences);
        competences.setLayout(competencesLayout);
        competencesLayout.setHorizontalGroup(
            competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(competencesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        competencesLayout.setVerticalGroup(
            competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(competencesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel2.add(competences, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 50));

        mission.setBackground(new java.awt.Color(153, 62, 97));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Task_15px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Missions");

        javax.swing.GroupLayout missionLayout = new javax.swing.GroupLayout(mission);
        mission.setLayout(missionLayout);
        missionLayout.setHorizontalGroup(
            missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        missionLayout.setVerticalGroup(
            missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel2.add(mission, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 50));

        mssm.setBackground(new java.awt.Color(74, 35, 68));
        mssm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mssmMouseClicked(evt);
            }
        });
        mssm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("M");
        mssm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 32, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("S");
        mssm.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 33, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("S");
        mssm.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 30, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("M");
        mssm.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 33, 30));

        sidePanel2.add(mssm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 140));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Liste des missions");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Chercher une mission:");
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 140, -1));

        listeP.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        body.add(listeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 100, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom", "Etat", "Date Début", "Durée (jours)"
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
        listePers.setViewportView(jTable1);

        body.add(listePers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 469, 410));

        listeS.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        listeS.setText("Compétences nécéssaires");
        body.add(listeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 16, 189, -1));

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        listeSkills.setViewportView(jList1);

        body.add(listeSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 250, 281));

        bModifier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bModifier.setText("Modifier");
        body.add(bModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        bAjouter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAjouter.setText("Ajouter");
        body.add(bAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personnel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personnel2MouseClicked
        try {
            this.dispose();
            new Menu_Personnel().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_personnel2MouseClicked

    private void mssmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mssmMouseClicked
        //Accueil accueil = new Accueil();
        dispose();
        //accueil.setVisible(true);
    }//GEN-LAST:event_mssmMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Mission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Mission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Mission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Mission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Mission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAjouter;
    private javax.swing.JButton bModifier;
    private javax.swing.JPanel body;
    private javax.swing.JPanel competences;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel personnel2;
    private javax.swing.JPanel sidePanel2;
    // End of variables declaration//GEN-END:variables
}
