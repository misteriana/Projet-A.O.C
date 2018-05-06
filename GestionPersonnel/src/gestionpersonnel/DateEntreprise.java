package gestionpersonnel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *<b> Cette Classe permet de gérer la date de l'application</b>
 * @author Anseea
 */
public class DateEntreprise {
    private Date date;
    final static SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    static final long DUREE_UN_JOUR = 24 * 60 * 60 * 1000;


    /**
     * Constructeur qui créé une date propre à l'entreprise à partir de aujourd'hui
     */
    public DateEntreprise() {
        date = new Date();
    }

    /**
     * Constructeur qui créé une date propre à l'entreprise à partir d'une chaine de caractère passée en paramètre
     * @param date
     *          chaine de caractère représentant la date "jj/mm/aaaa"
     * @throws java.text.ParseException
     *          exception soulevée si la chaine de caractère ne permet pas de créer la date
     */
    public DateEntreprise(String date) throws ParseException{
        this.date = (Date) FORMAT.parse(date);
    }
    
    /**
     * Constructeur qui créé une date propre à l'entreprise à partir d'une date
     * @param date 
     *          date (type java.util.Date) permettant de créer la date entreprise
     */
    public DateEntreprise(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return FORMAT.format(date);
    }
    
    /**
     * Getter sur la date courante
     * @return la date courante
     */
    public Date getDate(){
        return date;
    }  
    
    /**
     * Modifie la date courante de l'entreprise
     * @param date
     * @throws java.text.ParseException
     */
    public void setDate(String date) throws ParseException {
        this.date = (Date) FORMAT.parse(date);
        System.out.println("LA DATE param PG DateEntreprise " + date);
        System.out.println("LA DATE PG DateEntreprise " + this.date);
    }
    
    
}
