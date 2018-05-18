
package gestionpersonnel;

import java.text.ParseException;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import gestionpersonnel.DateEntreprise;
/**
 * Mission est la classe représentant une mission au sein de l'entreprise
 * @author cedri
 * @version 1.0
 */

public class Mission {
    private int duree, nbPers;
    private String nom;
    private DateEntreprise dateDeb;
    private HashMap<Integer, String> participants;
    private HashMap<String, Integer> competences;
    private StatutMission statut;
    
   /**
    * Constructeur d'une mission
    * @param nom
    *           Nom de la mission
    * @param duree
    *           Durée en jours ouvrés
    * @param dateDeb
    *           Date de début de la mission
    * @see projet.metier.missions.statutMission
    * @param statut 
    *           Statut de la mission (En cours, en préparation, planifiée, terminée)
    * @param nbPers 
    *           Nombre de personnes nécessaires à la réalisation de la mission
    */
    public Mission(String nom, int duree, String dateDeb, StatutMission statut, int nbPers){
        this.nom = nom;
        this.statut = statut;
        this.duree = duree;
        this.nbPers = nbPers;
        try {
            this.dateDeb = new DateEntreprise(dateDeb);
        } catch (ParseException ex) {
            Logger.getLogger(Mission.class.getName()).log(Level.SEVERE, null, ex);
        }
        participants = new HashMap<>();
        competences = new HashMap<>();
    }
    
    /**
     * Getter sur le nom de la mission
     * @return le nom de la mission
     */
    public String getNom(){
        return this.nom;
    }
    
    /**
     * Modifie le nom de la mission
     * @param nom 
     *          Nouveau nom de la mission
     */
    public void setNom(String nom){
        this.nom = nom;
    }
    
    /**
     * Getter sur le nombre de personnes nécessaires
     * @return le nombre de personnes nécessaire à la réalisation de la mission
     */
    public int getNbPers(){
        return this.nbPers;
    }
    
    /**
     * Modifie le nombre de personnes nécessaire à la réalisation de la mission
     * @param nbPers 
     *          Nouveau nombre de personnes nécessaires
     */
    public void setNbPers(int nbPers){
        this.nbPers = nbPers;
    }
    
    /**
     * Calcule le nombre de personnes nécessaires à partir du nombre de personnes nécessaires par compétences nécessaires
     * @return 
     *          Le nombre total de personnes nécessaires
     */
    public int getNbPersonnesNecessaires(){
        int nbPersonnes = 0;
        for(String comp : this.getCompetences().keySet())
            nbPersonnes += this.getCompetences().get(comp);
        return nbPersonnes;
    }

    /**
     * Getter des compétences nécessaires pour la mission
     * @return la map des compétences nécessaires (clef compétence, nombre nécéssaire)
     */
    public HashMap<String, Integer> getCompetences(){
        return this.competences;
    }
    
    /**
     * Getter du statut en cours de la mission
     * @return le statut de la mission
     */
    public StatutMission getStatut(){
        return this.statut;
    }
    
    /**
     * Modifie le statut de la mission
     * @param statut 
     *          Le nouveau statut de la mission
     */
    public void setStatut(StatutMission statut){
        this.statut = statut;
    }
    
    /**
     * Getter de la date de début de la mission
     * @return 
     *          La date de début de la mission
     */
    public DateEntreprise getDate(){
        return this.dateDeb;
    }
    
    /**
     * Modifie la date de début de la mission
     * @param date
     *          Nouvelle date de début de la mission
     * @throws ParseException Si la chaine de caractères passée en paramètre n'est pas au format "jj/mm/aaaa"
     */
    public void setDate(String date) throws ParseException{
        DateEntreprise d = new DateEntreprise(date);
        this.dateDeb = d;
    }
    
    /**
     * Getter sur la durée en jours ouvrés de la mission
     * @return la durée en jours ouvrés de la mission
     */
    public int getDuree(){
        return this.duree;
    }
    
    /**
     * Modifie la durée de la mission
     * @param duree 
     *          Nouvelle durée de la mission en jours ouvrés
     */
    public void setDuree(int duree){
        this.duree = duree;
    }
    
    /**
     * Getter des participants à la mission
     * @return la map des participants (associés à leur compétence) à la mission (clef personnel, clef compétence)
     */
    public HashMap<Integer, String> getParticipants(){
        return this.participants;
    }
    
    /**
     * Calcule la date de fin de la mission
     * @return la date de fin de la mission
     */
    public DateEntreprise dateFin(){
        return DateEntreprise.ajouterJours(dateDeb, duree);
    }
    
    /**
     * Ajoute un participant pour une compétence pour la mission
     * La même personne peut participer à la mission pour plusieurs compétences différentes
     * (Ex: si la même personne s'occupe de la conception et des tests)
     * 
     * @param keyPersonnel
     *          identifiant de la personne
     * @param keyCompetence
     *          compétence sur laquelle elle travaille
     */
    public void addParticipant(Integer keyPersonnel, String keyCompetence){
        participants.put(keyPersonnel, keyCompetence);
    }
    
    /**
     * Ajoute une mission à une personne
     * 
     * @param keyCompetence
     *          identifiant de la conpétence
     * @param nbParticipantsPourCompetence
     *          nombre de participants nécessaires
     */
    public void addCompetence(String keyCompetence, Integer nbParticipantsPourCompetence){
        competences.put(keyCompetence, nbParticipantsPourCompetence);
    }
}
