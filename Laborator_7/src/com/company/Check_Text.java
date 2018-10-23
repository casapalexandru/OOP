package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;

public class Check_Text {

    public static int getcheckSentences(String input){
        int NrOfSentences =0;
        for(int i = 0; i < input.length(); i++){
            Character z = input.charAt(i);
            if(z.equals('.')) NrOfSentences++;
        }
        return NrOfSentences;
    }

    public static int getcheckWords(String input){
        int NrOfWords = 1;
        for (int i = 0; i < input.length(); i++) {
            Character z = input.charAt(i);
            if (z.equals(' ')) NrOfWords++;
        }
        return NrOfWords;
    }

    public static int getcheckLetters(String input){
        int NrOfLetters = 0;
        for (int i = 0; i < input.length(); i++) {
            NrOfLetters++;
            Character z = input.charAt(i);
            if (z.equals(' ') || z.equals('.')) NrOfLetters--;
        }
        return NrOfLetters;
    }
    public static int getNrOfVowels(String input){
        int NrOfVowels = 0;
        for(int i = 0; i < input.length(); i++){
            Character z = input.charAt(i);
            if(z == 'a'|| z == 'e'||  z == 'i' || z == 'o' || z == 'u') NrOfVowels++;
        }
        return NrOfVowels;
    }

    public static int getNrOfConsonant(String input) {
        int NrOfConsonant = 0;
        for (int i = 0; i < input.length(); i++) {
            Character z = input.charAt(i);
            if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u') {
            }
            else if (z >= 'a' && z <= 'z') {
                NrOfConsonant++;
            }
        }
        return NrOfConsonant;
    }

    public static void getTopWords(String input, int maxNr){
        Map<String,Integer> words = new HashMap<String,Integer>();
        String[] roll = input.split("\\s+");
        for (final String word : roll) {
            Integer qty = words.get(word);
            if (qty == null) {
                qty = 1;
            } else {
                qty = qty + 1;
            }
            words.put(word, qty);
        }

        Map<String, Integer> sorted = words

                .entrySet()

                .stream()

                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))

                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

       // int maxNr = 5;
        int counter = 0;
        for(final String word : sorted.keySet() ){
            if (counter==maxNr) break;
            counter++;
            int nr = sorted.get(word);
            System.out.println("Word [ "+word+" ] appears: "+nr+" time(s)");
        }
    }

}
