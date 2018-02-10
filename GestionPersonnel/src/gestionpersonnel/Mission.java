/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonnel;

import java.util.Date;


enum Etat{PREPARATION, PLANNIFIEE, EN_COURS, FINIE};

/**
 *
 * @author jonathandetrier
 */
public class Mission {
    
    private int nbPeopleBesoin;
    private Date dateDebut;
    private int duree;
    private int id;
    private String[] competences;
    private Personnel[] personnels;
    private Etat state;
    
    public void nextState() {
        Etat e = Etat.PREPARATION;
        if (this.state == Etat.PREPARATION) {
            e = Etat.PLANNIFIEE;
        }
        if (this.state == Etat.PLANNIFIEE) {
            e = Etat.EN_COURS;
        }
        if (this.state == Etat.EN_COURS) {
            e = Etat.FINIE;
        }
        if (this.state == Etat.FINIE) {
            e = Etat.FINIE;
        }
        this.state = e;
    }
    
    public Etat getState() {
        return this.state;
    }
}
