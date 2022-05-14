/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> directory;

    public Abbreviations() {
        this.directory = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        String abb = formatString(abbreviation);
        String exp = formatString(explanation);
        
        if(this.directory.containsKey(abb)) {
            System.out.println("Abbreviation is already in the book");
        } else {
            directory.put(abb, exp);
        }
        
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if(this.directory.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        if( hasAbbreviation(abbreviation)) {
            String exp = directory.get(abbreviation);
            return exp;
        } else {
            return null;
        }
    }

    public static String formatString(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }

}
