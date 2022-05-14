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
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        //if arraylist doesn't exist for word, add one
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        //retrieve list and add to it 
        ArrayList<String> translations = this.dictionary.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList<String> translations = new ArrayList<>();
        if( dictionary.get(word) == null) {
            return new ArrayList<String>();
        }
        
        translations = dictionary.get(word);
        return translations;
    }
    
    public void remove(String word) {
        dictionary.remove(word);
    }
    
}
