
package gestionpersonnel;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * <b> Cette classe permet de récupérer la liste des compétences depuis un fichier csv </b>
 * 
 * @author jonathan detrier
 */
public class CompetenceDAO {
    
    /**
     * Cette liste contiendra l'ensemble des compétences existantes
     */
    List<Competence> competences = new ArrayList<>();
    
    /**
     * @author jonathan detrier
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     * @since v 1.0
     */
    public void recupererCompetences() throws IOException  {
        
        Reader r = Files.newBufferedReader(Paths.get("src/ressources/liste_competences.csv"));
        
        /**
         * CSVReader provient de la librairie open csv, qui facilite l'accès aux fichiers csv
         */
        CSVReader c = new CSVReader(r, ';');
        /**
         * Ce tableau va récupérer, ligne par ligne, le contenu du fichier csv
         */
        List<String[]> lines = c.readAll();
        for (String[] l : lines) {
            String id = l[0];
            String englishname = l[1];
            String name = l[2];
            Competence co = new Competence(id, englishname, name); 
            if (canAddToList(co)) {
                this.competences.add(co);
            }
        }
    }
    
    public boolean canAddToList(Competence c) {
        for (int i=0; i<this.competences.size(); i++) { 
            if (c.getId().equals(this.competences.get(i).getId())) {
                return false;
            }
        }
        return true;
    }
    
    public void lireCompetences() {
        for (Competence c : competences) {
            System.out.println("ID : " + c.getId() + " | Nom : " + c.getName() + " | Nom anglais : " + c.getEnglishname());
        }
    }
    
    public static void main (String[] args) throws IOException{
        CompetenceDAO cDAO = new CompetenceDAO();
        cDAO.recupererCompetences();
        cDAO.recupererCompetences();
        cDAO.lireCompetences();
        
    }
    
}
