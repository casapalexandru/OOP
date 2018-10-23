package com.company;

import java.lang.*;

public class Main {

    public static void main(String[] args) throws Exception{

        String input = Text.textFile("Text1.txt");
        System.out.println(input);
        System.out.println("\nNr of sentences: "+Check_Text.getcheckSentences(input));
        System.out.println("Nr of words: "+Check_Text.getcheckWords(input));
        System.out.println("Nr of letters: "+Check_Text.getcheckLetters(input));
        System.out.println("Nr of vowels: " + Check_Text.getNrOfVowels(input));
        System.out.println("Nr of consonants " + Check_Text.getNrOfConsonant(input));
        System.out.println("\nTop 5 words:");
        Check_Text.getTopWords(input, 5);
    }

}