package com.company;

import java.io.*;
import java.util.Scanner;

public class Text
{
    public static String textFile(String filePath) throws Exception
    {
        File file = new File(filePath);
        String input = "";
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            input += scan.nextLine();
        }
        input = input.toLowerCase();
        return input;

    }
}
