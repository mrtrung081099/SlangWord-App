package com.studenthcmus;
import java.util.TreeMap;
import java.util.regex.Pattern;



public class SlangWordList {
    public TreeMap<String, String> slangWords;
    public int size;
    
    public SlangWordList() {
        slangWords = new TreeMap<String, String>();
        size = 0;
    }
    
    public boolean add(String word, String definition) {
        if(!slangWords.containsKey(word)) {
            slangWords.put(word, definition);
            size++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int size() {
        return size;
    }

    public String get(String word) {
        return slangWords.get(word);
    }

    public void remove(String word) {
        slangWords.remove(word);
        size--;
    }

    public SlangWordList search(String definition) {
        SlangWordList result = new SlangWordList();
        for (String word : slangWords.keySet()) {
            if (Pattern.compile(Pattern.quote(definition),
                 Pattern.CASE_INSENSITIVE).matcher(slangWords.get(word)).find()) {
                result.add(word, slangWords.get(word));
            }
        }
        return result;
    }

    public String randomWord() {
        int randomIndex = (int) (Math.random() * size);
        int i = 0;
        for (String word : slangWords.keySet()) {
            if (i == randomIndex) {
                return word;
            }
            i++;
        }
        return slangWords.keySet().iterator().next();
    }

    public String randomDefinition() {
        int randomIndex = (int) (Math.random() * size);
        int i = 0;
        for (String word : slangWords.keySet()) {
            if (i == randomIndex) {
                return slangWords.get(word);
            }
            i++;
        }
        return slangWords.values().iterator().next();
    }
    public String toString() {
        String result = "";
        for (String word : slangWords.keySet()) {
            result += word + ": " + slangWords.get(word) + "\n";
        }
        return result;
    }

    public String getDefinition(String word) {
        return slangWords.get(word);
    }
}