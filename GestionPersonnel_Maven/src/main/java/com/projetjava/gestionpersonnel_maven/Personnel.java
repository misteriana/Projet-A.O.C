/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetjava.gestionpersonnel_maven;

import java.util.Date;

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
    private Date dateEntree;
    private Competence[] competences;
    
    public Personnel(int id, String n, String p, Date d) {
        this.id = id;
        this.nom = n;
        this.prenom = p;
        this.dateEntree = d;
        this.competences = new Competence[10];
    }
    
    public void addCompetences() {
    
    }
}
