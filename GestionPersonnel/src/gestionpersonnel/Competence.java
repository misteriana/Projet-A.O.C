
package gestionpersonnel;


/**
 *
 * @author cédric greufeille
 * @since v 1.0
 */
public class Competence {

    private String id;

    private String englishname;

    private String name;
    
    public Competence() {
        
    }
    
    public Competence(String id, String englishname, String name) {
        this.id = id;
        this.englishname = englishname;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getEnglishname() {
        return englishname;
    }

    public String getName() {
        return name;
    }
    
}
