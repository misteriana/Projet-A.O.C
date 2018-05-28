/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel;

import com.opencsv.CSVReader;
import static gestionpersonnel.PersonnelDAO.personnels;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b> Cette classe permet de récupérer la liste des missions depuis un fichier csv </b>
 * @author jonathandetrier
 */
public class MissionDAO {
    
     static List<Mission> missions = new ArrayList<>();
     static boolean hasloadM = false, hasloadP = false, hasloadC = false;
     
     /**
     * @author jonathan detrier
     * @throws java.io.FileNotFoundException
     *  Exception
     * @throws java.text.ParseException
     *  Exception
     * @throws java.io.IOException
     *  Exception
     * @since v 1.0
     */
    public void recupererMissions() throws IOException, ParseException  {
        Reader r = Files.newBufferedReader(Paths.get("src/ressources/liste_missions.csv"));
        
        /**
         * CSVReader provient de la librairie open csv, qui facilite l'accès aux fichiers csv
         */
        CSVReader c = new CSVReader(r, ';');
        /**
         * Ce tableau va récupérer, ligne par ligne, le contenu du fichier csv
         */
        List<String[]> lines = c.readAll();
        lines.remove(0);
        for (String[] l : lines) {
            int id = Integer.parseInt(l[0]);
            String nom = l[1];
            int duree = Integer.parseInt(l[2]);
            String de = l[3];
            int nbPersTot = Integer.parseInt(l[4]);
            int statut = Integer.parseInt(l[5]);
            Mission m = new Mission(id, nom, duree, de, statut, nbPersTot); 
            if (canAddToList(m)) {
                MissionDAO.missions.add(m);
                Mission.NUM_ID = id + 1;
            }
        }
        
    }
        
    /**
     * @author jonathan detrier
     * @throws IOException
     * Exception
     * @throws ParseException
     * ParseException
     * @since v 1.0
     */
    public void recupererCompetencesMissions() throws IOException, ParseException  {
        
        Reader r = Files.newBufferedReader(Paths.get("src/ressources/competences_mission.csv"));
        CompetenceDAO cDAO = new CompetenceDAO();
        
        cDAO.recupererCompetences();
        /**
         * CSVReader provient de la librairie open csv, qui facilite l'accès aux fichiers csv
         */
        CSVReader c = new CSVReader(r, ';');
        /**
         * Ce tableau va récupérer, ligne par ligne, le contenu du fichier csv
         */
        List<String[]> lines = c.readAll();
        lines.remove(0);
        for (String[] l : lines) {
            for (Mission m : missions) {
                if (m.getId() == Integer.parseInt(l[0])) {
                    for (int i = 1; i < l.length; i++) {
                        String competence = l[i];
                        i++;
                        Integer nbComp = Integer.parseInt(l[i]);
                        for (Competence comp : cDAO.competences) {
                            if (comp.getId().equals(competence) && canAddToListComp(comp, m)) { 
                                m.addCompetence(competence, nbComp);
                                System.out.println(m.getCompetences().toString());
                            }
                        }
                    }
                }
            }
        
        }
    }
    
    /**
     * @author jonathan detrier
     * @throws IOException
     *  Exception
     * @throws ParseException
     *  Exception
     * @since v 1.0
     */
    public void recupererParticipantsMissions() throws IOException, ParseException  {
        
        Reader r = Files.newBufferedReader(Paths.get("src/ressources/personnels_mission.csv"));
        PersonnelDAO pDAO = new PersonnelDAO();
        if (!PersonnelDAO.hasloadP)
            pDAO.recupererPersonnels();
        if (!PersonnelDAO.hasloadC)
            pDAO.recupererCompetencesPersonnels();
        /**
         * CSVReader provient de la librairie open csv, qui facilite l'accès aux fichiers csv
         */
        CSVReader c = new CSVReader(r, ';');
        /**
         * Ce tableau va récupérer, ligne par ligne, le contenu du fichier csv
         */
        List<String[]> lines = c.readAll();
        lines.remove(0);
        for (String[] l : lines) {
            for (Mission m : missions) {
                if (m.getId() == Integer.parseInt(l[0])) {
                    for (int i = 1; i < l.length; i++) {
                        Integer personnel = Integer.parseInt(l[i]);
                        for (Personnel p : pDAO.personnels) {
                            if (p.getId() == (int) personnel && canAddToListPers(p, m)) { 
                                m.addParticipant(personnel, p);
                                System.out.println(m.getParticipants().toString());
                            }
                        }
                    }
                }
            }
        
        }
    }
    
    /**
     * 
     * Permet de vérifier si une mission de la liste a déjà cet identifiant
     * @author jonathan detrier
     * @param m : Mission
     * @return Le booléen disant si on peut ajouter l'élément à la liste
     * @since v 1.0
     */
    public boolean canAddToList(Mission m) {
        for (int i=0; i<MissionDAO.missions.size(); i++) { 
            if (m.getId() == MissionDAO.missions.get(i).getId()) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * 
     * Permet de vérifier si une compétence de la liste a déjà cet identifiant
     * @author jonathan detrier
     * @param c : Competence
     * @param m : Mission
     * @return Le booléen disant si on peut ajouter l'élément à la liste
     * @since v 1.0
     */
    public boolean canAddToListComp(Competence c, Mission m) {
            if (m.getCompetences().containsKey(c.getId())) {
                return false;
            }
        return true;
    }

        /**
     * 
     * Permet de vérifier si un personnel de la liste a déjà cet identifiant
     * @author jonathan detrier
     * @param p 
     *      Personnel
     * @param m 
     *      Mission
     * @return Le booléen disant si on peut ajouter l'élément à la liste
     * @since v 1.0
     */
    public boolean canAddToListPers(Personnel p, Mission m) {
            if (m.getParticipants().containsKey(p.getId())) {
                return false;
            }
        return true;
    }
    
    public static void main(String[] args) {
         try {
             MissionDAO mDAO = new MissionDAO();
             mDAO.recupererMissions();
             mDAO.recupererCompetencesMissions();
             mDAO.recupererParticipantsMissions();
         } catch (IOException ex) {
             Logger.getLogger(MissionDAO.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ParseException ex) {
             Logger.getLogger(MissionDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}

