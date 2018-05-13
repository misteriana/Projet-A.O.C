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

        sidePanel = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tdB = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        personnel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        competences = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mission = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        param = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        listeP = new javax.swing.JTextField();
        listePers = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        listeS = new javax.swing.JLabel();
        listeSkills = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        bAjouter = new javax.swing.JButton();
        bAjouter1 = new javax.swing.JButton();
        bAjouter2 = new javax.swing.JButton();
        bModifier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(991, 540));
        setResizable(false);

        sidePanel.setBackground(new java.awt.Color(255, 255, 255));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 184, 140));
        jLabel9.setFont(new java.awt.Font("Nunito Sans Light", 0, 32)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 184, 140));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("M");

        jLabel10.setFont(new java.awt.Font("Nunito Sans Light", 0, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(229, 101, 144));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("S");

        jLabel12.setFont(new java.awt.Font("Nunito Sans Light", 0, 32)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(229, 101, 144));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("M");

        jLabel11.setFont(new java.awt.Font("Nunito Sans Light", 0, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 184, 140));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("S");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        sidePanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 242, -1));

        tdB.setBackground(new java.awt.Color(255, 255, 255));
        tdB.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tdB1-rose.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(182, 182, 183));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tableau de bord");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/line.png"))); // NOI18N

        javax.swing.GroupLayout tdBLayout = new javax.swing.GroupLayout(tdB);
        tdB.setLayout(tdBLayout);
        tdBLayout.setHorizontalGroup(
            tdBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tdBLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );
        tdBLayout.setVerticalGroup(
            tdBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tdBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tdBLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(tdBLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePanel.add(tdB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 215, 242, 51));

        personnel.setBackground(new java.awt.Color(255, 255, 255));
        personnel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        personnel.setPreferredSize(new java.awt.Dimension(139, 50));
        personnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                personnelMousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(182, 182, 183));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Personnel");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user1-gris.png"))); // NOI18N

        javax.swing.GroupLayout personnelLayout = new javax.swing.GroupLayout(personnel);
        personnel.setLayout(personnelLayout);
        personnelLayout.setHorizontalGroup(
            personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
        );
        personnelLayout.setVerticalGroup(
            personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnelLayout.createSequentialGroup()
                .addGroup(personnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(personnelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, personnelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sidePanel.add(personnel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 272, 242, -1));

        competences.setBackground(new java.awt.Color(255, 255, 255));
        competences.setPreferredSize(new java.awt.Dimension(174, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skills1-gris.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Compétences");

        javax.swing.GroupLayout competencesLayout = new javax.swing.GroupLayout(competences);
        competences.setLayout(competencesLayout);
        competencesLayout.setHorizontalGroup(
            competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(competencesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(87, 87, 87))
        );
        competencesLayout.setVerticalGroup(
            competencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(competences, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 333, 242, 41));

        mission.setBackground(new java.awt.Color(255, 255, 255));
        mission.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        mission.setPreferredSize(new java.awt.Dimension(126, 50));
        mission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                missionMousePressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mission1-gris.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Nunito Sans", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(182, 182, 183));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Missions");

        javax.swing.GroupLayout missionLayout = new javax.swing.GroupLayout(mission);
        mission.setLayout(missionLayout);
        missionLayout.setHorizontalGroup(
            missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(124, 124, 124))
        );
        missionLayout.setVerticalGroup(
            missionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(missionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidePanel.add(mission, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, 242, 52));

        param.setBackground(new java.awt.Color(255, 255, 255));
        param.setPreferredSize(new java.awt.Dimension(240, 50));
        param.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paramMousePressed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/param1-gris.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Nunito Sans SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(182, 182, 183));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Paramètres");

        javax.swing.GroupLayout paramLayout = new javax.swing.GroupLayout(param);
        param.setLayout(paramLayout);
        paramLayout.setHorizontalGroup(
            paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paramLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93))
        );
        paramLayout.setVerticalGroup(
            paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paramLayout.createSequentialGroup()
                .addGroup(paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        sidePanel.add(param, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 448, 242, 43));

        date.setFont(new java.awt.Font("Nunito Sans Light", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("jLabel1");
        sidePanel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 235, -1));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setMaximumSize(new java.awt.Dimension(32767, 32767));
        body.setMinimumSize(new java.awt.Dimension(0, 0));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Liste des missions");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Chercher une mission:");
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 140, -1));

        listeP.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        body.add(listeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 100, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Nom", "Etat", "Date Début", "Date fin", "Nb pers."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listePers.setViewportView(jTable1);

        body.add(listePers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 710, 230));

        listeS.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        listeS.setText("Etat de la mission : ");
        body.add(listeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 189, -1));

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        listeSkills.setViewportView(jList1);

        body.add(listeSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 710, 130));

        bAjouter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAjouter.setText("Supprimer");
        bAjouter.setActionCommand("Supprimer");
        bAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjouterActionPerformed(evt);
            }
        });
        body.add(bAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        bAjouter1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAjouter1.setText("Ajouter");
        bAjouter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bAjouter1MousePressed(evt);
            }
        });
        bAjouter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjouter1ActionPerformed(evt);
            }
        });
        body.add(bAjouter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        bAjouter2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAjouter2.setText("Détails");
        bAjouter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjouter2ActionPerformed(evt);
            }
        });
        body.add(bAjouter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        bModifier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bModifier.setText("Modifier");
        bModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifierActionPerformed(evt);
            }
        });
        body.add(bModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personnelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personnelMousePressed
        try {
            Menu_Personnel m = new Menu_Personnel();
            m.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_personnelMousePressed

    private void missionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missionMousePressed
        Menu_Mission m = new Menu_Mission();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_missionMousePressed

    private void paramMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paramMousePressed
        new Parametres().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paramMousePressed

    private void bAjouter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjouter2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAjouter2ActionPerformed

    private void bAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAjouterActionPerformed

    private void bAjouter1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAjouter1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAjouter1MousePressed

    private void bAjouter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjouter1ActionPerformed
        //try {
           // System.out.println(PersonnelDAO.personnels.size());
            Add_Mission am = new Add_Mission(this, true);
            am.setVisible(true);
         //   System.out.println(PersonnelDAO.personnels.size());
        //} catch (IOException ex) {
        //    Logger.getLogger(Menu_Mission.class.getName()).log(Level.SEVERE, null, ex);
        //} catch (ParseException ex) {
        //    Logger.getLogger(Menu_Mission.class.getName()).log(Level.SEVERE, null, ex);
       // }        // TODO add your handling code here:
    }//GEN-LAST:event_bAjouter1ActionPerformed

    private void bModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bModifierActionPerformed

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
    private javax.swing.JButton bAjouter1;
    private javax.swing.JButton bAjouter2;
    private javax.swing.JButton bModifier;
    private javax.swing.JPanel body;
    private javax.swing.JPanel competences;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel param;
    private javax.swing.JPanel personnel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel tdB;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
