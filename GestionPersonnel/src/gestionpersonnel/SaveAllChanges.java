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
 *
 * @author jonathandetrier
 */
public class SaveAllChanges {
    
    private PrintWriter pw;
    
    public void saveChanges() throws IOException, ParseException {
        try {
            PersonnelDAO pers = new PersonnelDAO();
            if (!PersonnelDAO.hasloadP)
                pers.recupererPersonnels();
            if (!PersonnelDAO.hasloadC)
                pers.recupererCompetencesPersonnels();
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
