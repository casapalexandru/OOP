package com.company;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        String expression;

        File file = new File("text1.txt");
        Scanner stringline = new Scanner(file);
        while (stringline.hasNextLine()) {
            expression = stringline.nextLine();
            System.out.println(expression);
            Check_Bracket.check_bracket(expression);
        }

    }
}