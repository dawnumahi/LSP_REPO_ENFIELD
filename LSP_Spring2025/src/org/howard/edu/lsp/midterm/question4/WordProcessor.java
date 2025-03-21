package org.howard.edu.lsp.midterm.question4;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
    private String sentence; // Stores the sentence to be processed

    // Constructor
    public WordProcessor(String sentence) { 
        this.sentence = sentence;
    }

    // Method to find all longest words in the sentence
    public List<String> findLongestWords() { 
        if (sentence == null || sentence.trim().isEmpty()){
            return new ArrayList<>();
        }
        List<String> longestWords = new ArrayList<String>();

        String[] words = sentence.trim().split("\\s+");

        /**
         * Search through all the words and find the longest word.
         */
        int maxLength = 0;
        for (String word: words){
            if (word.length() > maxLength){
                maxLength = word.length();
            }
        }

        /**
         * Search through all the words and add all words of the maximum length to an arraylist.
         */
        for (String word: words){
            if (word.length() == maxLength){
                longestWords.add(word);
            }
        }
        return longestWords;
     }

}
