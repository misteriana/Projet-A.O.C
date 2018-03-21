
package gestionpersonnel;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import static java.lang.Thread.sleep;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

/**
 *
 * <b> Cette classe permet de récupérer la liste des personnels depuis un fichier csv </b>
 * 
 * @author jonathan detrier
 */
public class PersonnelDAO {
    
    /**
     * Cette liste contiendra l'ensemble des personnels existantes
     */
    static List<Personnel> personnels = new ArrayList<>();
    
    /**
     * @author jonathan detrier
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     * @since v 1.0
     */
    public void recupererPersonnels() throws IOException, ParseException  {
        
        Reader r = Files.newBufferedReader(Paths.get("src/ressources/liste_personnel.csv"));
        
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
            String prenom = l[0];
            String nom = l[1];
            String date = l[2];
            String id = l[3];
            int id_int = Integer.parseInt(id);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date d = df.parse(date);
            Personnel p = new Personnel(id_int, nom, prenom, d); 
            if (canAddToList(p)) {
                PersonnelDAO.personnels.add(p);
            }
        }
    }
        
    /**
     *
     * @throws IOException
     * @throws ParseException
     */
    public void recupererCompetencesPersonnels() throws IOException, ParseException  {
        
        Reader r = Files.newBufferedReader(Paths.get("src/ressources/competences_personnel.csv"));
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
            for (Personnel pers : personnels) {
                if (pers.getId() == Integer.parseInt(l[0])) {
                    for (int i = 1; i < l.length; i++) {
                        String competence = l[i];
                        for (Competence comp : cDAO.competences) {
                            if (comp.getId().equals(competence) && canAddToListComp(comp, pers)) { 
                                pers.competences.add(comp);       
                            }
                        }
                    }
                }
            }
        
        }
    }
    
    /**
     * 
     * Permet de vérifier si un personnel de la liste a déjà cet identifiant
     * @author jonathan detrier
     * @param p : Personnel
     * @return Le booléen disant si on peut ajouter l'élément à la liste
     * @since v 1.0
     */
    public boolean canAddToList(Personnel p) {
        for (int i=0; i<PersonnelDAO.personnels.size(); i++) { 
            if (p.getId() == PersonnelDAO.personnels.get(i).getId()) {
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
     * @param p : Personnel
     * @return Le booléen disant si on peut ajouter l'élément à la liste
     * @since v 1.0
     */
    public boolean canAddToListComp(Competence c, Personnel p) {
        for (Competence co : p.competences) {
            if (c.getId().equals(co.getId())) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Permet d'afficher à l'écran le contenu de la liste
     * 
     * @author jonathan detrier
     * @since v 1.0
     */
    public void lirePersonnels() {
        for (Personnel p : personnels) {
            System.out.println("ID : " + p.getId() + " | Nom : " + p.getName() + " | Prénom : " + p.getPrenom() + " | Date d'entrée : " + p.getDateE());
        }
    }
    
    public void lireCompPers() {
        for (Personnel p : personnels) {
            for (Competence compt : p.competences) {
                System.out.println(p.getName() + " " + p.getPrenom() + " a la compétence " + compt.getName());
            }
        }
    }
    
    public static void main (String[] args) throws IOException, ParseException, InterruptedException{
        PersonnelDAO pDAO = new PersonnelDAO();
        pDAO.recupererPersonnels();
        pDAO.recupererCompetencesPersonnels();
        pDAO.lireCompPers();
        
    }
    
}
