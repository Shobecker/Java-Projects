import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias
 */
public class Dictionary {

    private HashMap<String, String> dictionary;
    
    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        String getWord = this.dictionary.get(word);
        if (getWord != null) {
            return getWord;
        }
        return getWord;
    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>(); 
        
        for (String key : this.dictionary.keySet()) {
            String value = this.dictionary.get(key);
            String toAddToTranslationList = key + " = " + value;
            translationList.add(toAddToTranslationList);
        }
        return translationList;
    }
    
}
