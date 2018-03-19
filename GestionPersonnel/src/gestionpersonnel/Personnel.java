/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <b> Cette classe définit ce qu'est un "personnel" et permet de récupérer les objets depuis les fichiers CSV </b>
 * 
 * @author jonathandetrier
 * @since v 1.0
 * 
 */
public class Personnel {
    
    private int id;
    private String nom;
    private String prenom;
    private Date dateE;
    public List<Competence> competences = new ArrayList<>();
    
    public Personnel(int id, String n, String p, Date d) {
        this.id = id;
        this.nom = n;
        this.prenom = p;
        this.dateE = d;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateE() {
        return dateE;
    }
    
}
