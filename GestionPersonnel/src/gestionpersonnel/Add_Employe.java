

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
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * <b> Cette classe permet d'ajouter un employé</b>
 * 
 * @author jonathan detrier
 */

public class Add_Employe extends javax.swing.JDialog {

    private JFrame parent;
    private String id;
    private String name;
    private String prenom;
    private String dateE;
    private DefaultListModel modele;
    
    /**
     * Creates new form Add_Employe
     * @param parent
     * @param modal
     */
    public Add_Employe(JFrame parent, boolean modal) throws IOException, ParseException {
        super(parent, modal);
        this.parent = parent;
        this.modele = new DefaultListModel();
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        recupererCompetences();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        identite = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        nomTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        prenomTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        ligne = new javax.swing.JSeparator();
        competences = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        competencesEmployer = new javax.swing.JScrollPane();
        competencesEmployerListe = new JList(modele);
        quit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        competencesDispo = new javax.swing.JScrollPane();
        competencesDisponiblesListe = new JList(modele);

        setTitle("Ajouter un employé");

        bg.setBackground(new java.awt.Color(248, 249, 250));

        title.setFont(new java.awt.Font("Nunito Sans Light", 0, 30)); // NOI18N
        title.setForeground(new java.awt.Color(74, 74, 74));
        title.setText("Ajouter un employé");

        identite.setFont(new java.awt.Font("Nunito Sans Light", 0, 26)); // NOI18N
        identite.setForeground(new java.awt.Color(74, 74, 74));
        identite.setText("Identité");

        nom.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        nom.setText("Nom");

        nomTextField.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        nomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        jLabel5.setText("Prénom");

        prenomTextField.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        prenomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTextFieldActionPerformed(evt);
            }
        });

        dateTextField.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N

        date.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        date.setText("Date d'entrée");

        competences.setFont(new java.awt.Font("Nunito Sans Light", 0, 26)); // NOI18N
        competences.setForeground(new java.awt.Color(74, 74, 74));
        competences.setText("Compétences");

        add.setText(">");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setText("<");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        competencesEmployerListe.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        competencesEmployerListe.setSelectionBackground(new java.awt.Color(229, 101, 144));
        competencesEmployer.setViewportView(competencesEmployerListe);

        quit.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        quit.setForeground(new java.awt.Color(74, 74, 74));
        quit.setText("Quitter");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        save.setForeground(new java.awt.Color(74, 74, 74));
        save.setText("Enregistrer");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        competencesDisponiblesListe.setFont(new java.awt.Font("Nunito Sans", 0, 16)); // NOI18N
        competencesDisponiblesListe.setSelectionBackground(new java.awt.Color(229, 101, 144));
        competencesDispo.setViewportView(competencesDisponiblesListe);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(competences)
                        .addGap(375, 375, 375))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(nom)
                        .addGap(18, 18, 18)
                        .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identite)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(prenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(date)
                                .addGap(18, 18, 18)
                                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ligne)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addComponent(competencesDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(add)
                                .addComponent(remove))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                            .addComponent(competencesEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(quit)
                            .addGap(45, 45, 45)
                            .addComponent(save)
                            .addGap(266, 266, 266))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(identite, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom)
                    .addComponent(jLabel5)
                    .addComponent(prenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(ligne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(competences)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(competencesEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(competencesDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(add)
                        .addGap(29, 29, 29)
                        .addComponent(remove)))
                .addGap(33, 33, 33)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(quit))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        saveEmploye();
        this.dispose();
    }//GEN-LAST:event_saveActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        Verification_Add_Employe vae = new Verification_Add_Employe(parent, true, this);
        vae.setAlwaysOnTop(true);
        vae.setVisible(true);
    }//GEN-LAST:event_quitActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        supprimerCompetence();
    }//GEN-LAST:event_removeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        addCompetenceToPersonnel();
    }//GEN-LAST:event_addActionPerformed

    private void prenomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTextFieldActionPerformed

    private void nomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTextFieldActionPerformed

    public void saveEmploye() {
        if (nomTextField.getText().isEmpty() || prenomTextField.getText().isEmpty() || dateTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez entrer l'ensemble des données demandées (Nom, prénom et Date d'entrée)", "Erreur : Champs requis", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                String nom = nomTextField.getText();
                String prenom = prenomTextField.getText();
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date dateE = df.parse(dateTextField.getText());
                Personnel p = new Personnel(nom, prenom, dateE);
                PersonnelDAO.personnels.add(p);
                
                for (int i = 0; i < modele.getSize(); i++) {
                    for (Competence co : CompetenceDAO.competences) {
                        if (modele.get(i).equals(co.getName())) {
                            p.competences.add(co);
                        }
                    }
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Le format de la date n'est pas bon. Veuillez entrer une date au format : jj/mm/aaaa", "Erreur :" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }            
        }
    }
    
    public void recupererCompetences() throws IOException {
        CompetenceDAO c = new CompetenceDAO();
        c.recupererCompetences();
		Vector<String> model = new Vector<>();
        for (Competence co : CompetenceDAO.competences) {
            model.add(co.getName());
            //choisirComboBox1.addItem(s);
        }
	competencesDisponiblesListe.setListData(model);
    }
    
    public void addCompetenceToPersonnel() {
        //String text = choisirComboBox1.getSelectedItem().toString();
        String text = competencesDisponiblesListe.getSelectedValue();
        if (!modele.contains(text)) {
            modele.addElement(text);
            competencesEmployerListe.setModel(modele);
        }
        
    }
    
    public void supprimerCompetence() {
        String text = competencesEmployerListe.getSelectedValue();
        modele.remove(modele.indexOf(text));
        competencesEmployerListe.setModel(modele);
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
            java.util.logging.Logger.getLogger(Add_Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Add_Employe dialog = new Add_Employe(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Add_Employe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Add_Employe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel competences;
    private javax.swing.JScrollPane competencesDispo;
    private javax.swing.JList<String> competencesDisponiblesListe;
    private javax.swing.JScrollPane competencesEmployer;
    private javax.swing.JList<String> competencesEmployerListe;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel identite;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator ligne;
    private javax.swing.JLabel nom;
    private javax.swing.JTextField nomTextField;
    private javax.swing.JTextField prenomTextField;
    private javax.swing.JButton quit;
    private javax.swing.JButton remove;
    private javax.swing.JButton save;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
