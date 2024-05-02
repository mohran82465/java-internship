package org.mohran;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String file = "src/main/resources/Lincoln.txt";
        int count = 0 ;
        int wordCount = 0 ;
        File pathFile = new File(file);

        try {
            Scanner scan = new Scanner(pathFile)    ;
            while(scan.hasNext())
            {
                String word = scan.next();
                count++;
                word = word.replace(",","");
                word = word.replace("-","");
                word = word.replace(".","");
                word = word.replace(" ","");
                // there are a better way by using regex, but it's hard to write regex x_x
                if (!word.isEmpty())
                {
                    wordCount++;
                }
            }
            scan.close();
            FileWriter out  = new FileWriter(pathFile ,true);
            out.write("\nWord and characters count in this file are :  "+count);
            out.write("\nOnly word count in this file are :  "+wordCount);
            out.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("number of words in the file : "+wordCount  );

    }
}