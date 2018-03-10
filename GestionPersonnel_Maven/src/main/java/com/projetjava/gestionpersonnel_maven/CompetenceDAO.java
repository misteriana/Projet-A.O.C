
package com.projetjava.gestionpersonnel_maven;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
         * CsvToBean provient de la librairie open csv, qui facilite l'accès aux fichiers csv
         */
        CsvToBean lecteur = new CsvToBeanBuilder(r)
                    .withType(Competence.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        /**
         * Cette liste va récupérer, ligne par ligne, le contenu du fichier csv
         */
        List<Competence> comp = lecteur.parse();
        
        this.competences.addAll(comp);
              
    }
    
    public void lireCompetences() {
        for (Competence c : competences) {
            System.out.println(c.getId() + " " + c.getName() + " " + c.getEnglishname());
        }
    }
    
    public static void main (String[] args) throws IOException{
        CompetenceDAO cDAO = new CompetenceDAO();
        cDAO.recupererCompetences();
        cDAO.lireCompetences();
        
    }
    
}
