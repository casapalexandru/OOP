package com.company;

public class Check_Bracket {
    public static void check_bracket(String expression){
        int count = 0;

        char[] character = expression.toCharArray();
        for (int i = 0; i < expression.length(); i++) {
            if (character[i] == '(') count++;
            if (character[i] == ')') count--;
            if (count < 0) {System.out.println("Incorrect expression");break;}

        }
        if (count == 0) System.out.println("Correct expression");
        if (count > 0) System.out.println("Exists " + count + " unclosed bracket(s) in your expression");
    }
}
