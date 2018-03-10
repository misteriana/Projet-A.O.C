
package gestionpersonnel;

import java.util.Date;
import java.util.HashMap;


/**
 * 
 * <b> Cette énumération permet de définir l'état d'une mission </b>
 * 
 * 
 * <p>
 * La mission est dans l'état "PREPARATION" lorsqu'elle a été créée.
 * La mission est dans l'état "PLANNIFIEE" lorsque toutes les informations nécessaires ont été entrées, et que du personnel a satisfait les besoins.
 * La mission est dans l'état "EN_COURS" lorsque la date de début est dépassée.
 * La mission est dans l'état "FINIE" lorsqu'elle est terminée.
 * </p>
 * 
 * @author jonathan detrier
 */

enum Etat{PREPARATION, PLANNIFIEE, EN_COURS, FINIE};

/**
 *
 * <b> La classe Mission définie ce qu'est une mission, afin de faire l'interface entre le fichier CSV, et l'interface graphique. </b>
 * 
 * @author jonathan detrier
 * @since v 1.0
 */
public class Mission {
    
    private int nbPeopleBesoin;
    private Date dateDebut;
    private int duree;
    private int id;
    private Competence[] competences;
    private Personnel[] personnels;
    private Etat state;
    
    //public Mission(int nbpb, Date db, int d, int id)
    
    /** 
     * 
     * <p> Permet de passer la mission à l'état suivant </p>
     * 
     * @return void
     * @author jonathan detrier
     * @since v 1.0
     */
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
    
    /**
     * 
     * <p> Permet de récupérer l'identifiant d'une mission </p>
     * 
     * @author jonathan detrier
     * @since v 1.0
     * @return L'identifiant de la mission
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * 
     * <p> Permet de récupérer l'état d'une mission </p>
     * 
     * @author jonathan detrier
     * @since v 1.0
     * @return L'état de la mission
     */
    public Etat getState() {
        return this.state;
    }
    
}
