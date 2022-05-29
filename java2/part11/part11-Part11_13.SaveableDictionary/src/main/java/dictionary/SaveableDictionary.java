package dictionary;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.FileWriter;


public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {

        this.dictionary = new HashMap<>();
        this.file = "";

    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {

        String result = null;

        result = this.dictionary.getOrDefault(word, null);
        if (result == null & dictionary.containsValue(word)) {
            for (String key : dictionary.keySet()) {
                if (word.equals(dictionary.get(key))) {
                    result = key;
                }
            }
        }

        return result;

    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        }

        if (dictionary.containsValue(word)) {
            dictionary.values().remove(word);
        }

    }

    public boolean load() {

        try ( Scanner scanner = new Scanner(Paths.get(this.file))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] parts = row.split(":");
                dictionary.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }
    
    public boolean save() {
        
        try(FileWriter writer = new FileWriter(this.file, false)) {
            String entry = "";
            for( String key: dictionary.keySet()) {
                entry = entry + key + ":" + dictionary.get(key) + "\n";
                
            }
            writer.write(entry);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

}
