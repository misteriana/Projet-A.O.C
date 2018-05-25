/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b> Sauvegarde l'ensemble des modifications effectuées.   </b>
 * @author jonathandetrier
 */
public class SaveAllChanges {
    
    private PrintWriter pw;
    
    /** 
     * Ecrit dans les fichiers CSV avant de fermer l'application pour sauvegarder les modifications 
     * @author jonathan detrier 
     * @throws IOException 
     * @throws ParseException  
     * @since v 1.1 
     */
    
    public void saveChanges() throws IOException, ParseException {
        try {
            PersonnelDAO pers = new PersonnelDAO();
            MissionDAO miss = new MissionDAO();
            if (!PersonnelDAO.hasloadP)
                pers.recupererPersonnels();
            if (!PersonnelDAO.hasloadC)
                pers.recupererCompetencesPersonnels();
            if (!MissionDAO.hasloadM)
                miss.recupererMissions();
            if (!MissionDAO.hasloadC)
                miss.recupererCompetencesMissions();
            if (!MissionDAO.hasloadP)
                miss.recupererParticipantsMissions();              
            File f = new File("src/ressources/liste_personnel.csv");
            pw = new PrintWriter(new FileOutputStream(f));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            pw.println("Prenom;Nom;date entrée entreprise;identifiant"); 
            int i = 0;
            for (Personnel p : PersonnelDAO.personnels) {
                i++;
                if (i < PersonnelDAO.personnels.size())
                    pw.println(p.getPrenom() + ";" + p.getName() + ";" + df.format(p.getDateE()) + ";" + String.valueOf(p.getId()));
                if (i == PersonnelDAO.personnels.size()) 
                  pw.print(p.getPrenom() + ";" + p.getName() + ";" + df.format(p.getDateE()) + ";" + String.valueOf(p.getId())); 
            }         
            pw.close();
            File f2 = new File("src/ressources/competences_personnel.csv");
            pw = new PrintWriter(new FileOutputStream(f2));
            pw.println("Employe;Liste Competences");
            i = 0;
            for (Personnel p : PersonnelDAO.personnels) {
                i++;
                pw.print(String.valueOf(p.getId()));
                for (Competence c : p.competences) {
                    pw.print(";" + c.getId());
                }
                if (i < PersonnelDAO.personnels.size())
                    pw.println();
            }
            pw.close();
            File f3 = new File("src/ressources/competences_mission.csv");
            pw = new PrintWriter(new FileOutputStream(f3));
            pw.println("Mission;Liste Competences avec quantité besoin");
            i = 0;
            for (Mission m : MissionDAO.missions) {
                i++;
                pw.print(String.valueOf(m.getId()));
                for (String s : m.getCompetences().keySet()) {
                    pw.print(";" + s + ";" + m.getCompetences().get(s));
                }
                if (i < PersonnelDAO.personnels.size())
                    pw.println();
            }
            pw.close();
            File f4 = new File("src/ressources/liste_missions.csv");
            pw = new PrintWriter(new FileOutputStream(f4));
            pw.println("Id;Nom;Duree;DateDeb;NbPersTot;Statut"); 
            i = 0;
            for (Mission m : MissionDAO.missions) {
                i++;
                if (i < MissionDAO.missions.size())
                    pw.println(String.valueOf(m.getId()) + ";" + m.getNom() + ";" + String.valueOf(m.getDuree()) + ";" + df.format(m.getDate().getDate()) + ";" + String.valueOf(m.getNbPers()) + ";" + String.valueOf(m.getStatut()));
                if (i == MissionDAO.missions.size()) 
                    pw.print(String.valueOf(m.getId()) + ";" + m.getNom() + ";" + String.valueOf(m.getDuree()) + ";" + df.format(m.getDate().getDate()) + ";" + String.valueOf(m.getNbPers()) + ";" + String.valueOf(m.getStatut()));
            }         
            pw.close();
            File f5 = new File("src/ressources/personnels_mission.csv");
            pw = new PrintWriter(new FileOutputStream(f5));
            pw.println("Mission;Liste Personnels");
            i = 0;
            for (Mission m : MissionDAO.missions) {
                i++;
                pw.print(String.valueOf(m.getId()));
                for (Integer in : m.getParticipants().keySet()) {
                    pw.print(";" + in);
                }
                if (i < MissionDAO.missions.size())
                    pw.println();
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveAllChanges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) throws IOException, ParseException {
        SaveAllChanges s = new SaveAllChanges();
        PersonnelDAO p = new PersonnelDAO();
        p.recupererPersonnels();
        p.recupererCompetencesPersonnels();
        s.saveChanges();
    }
}
