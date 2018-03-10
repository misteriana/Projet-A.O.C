
package com.projetjava.gestionpersonnel_maven;

import com.opencsv.bean.CsvBindByPosition;

/**
 *
 * @author jonathandetrier
 * @since v 1.0
 */
public class Competence {

    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String englishname;

    @CsvBindByPosition(position = 2)
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
