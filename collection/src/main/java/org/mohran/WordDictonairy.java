package org.mohran;

import java.util.*;

public class WordDictonairy {
    private Map<Character , Set<String>> map ;

    public WordDictonairy() {
        map = new TreeMap<>();
    }
    public void addWord(String word)
    {
        if(word.isEmpty()){
            System.out.println( "you don't enter any value" ) ;
            return ;
        }
        char firstChar = word.toLowerCase().charAt(0);
        map.putIfAbsent(firstChar,new TreeSet<>());
        Set<String> wordsOfTheSameStarting = map.get(firstChar);
        wordsOfTheSameStarting.add(word);

    }

    public void printAllWords()
    {
        for(Map.Entry<Character,Set<String>> words : map.entrySet())
        {
            System.out.println(words.getKey() + " :"+ words.getValue());
        }

    }
    public void printWordsOfChar(char character)
    {
        Set<String> words = map.get(character);
        if (words == null )
        {
            System.out.println("There are not words start with this Character : "+character);
        }
        else {
            System.out.println("Words starts with character "+character+" :");
            System.out.println(words);
        }
    }
    public void enterTheWord()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word plz:");
        String word = scan.next();
        addWord(word);
    }

    public static void main(String[] args) {
        WordDictonairy list = new WordDictonairy();
        Scanner scan = new Scanner(System.in);
        while(true) {

            System.out.println("1:Enter the word you want to add to Word Dictionary");
            System.out.println("2:print all of the letters and corresponding words. ");
            System.out.println("3:print the words of a given letter. ");
            int number = 0;
            try {
                 number = scan.nextInt();
            }
            catch (Exception ex)
            {

            }
            if(number == 1)
            {
                list.enterTheWord();
            } else if (number == 2) {
                list.printAllWords();
            } else if (number == 3) {
                System.out.println("please enter your character you want to know !!?");
                char character = scan.next().charAt(0);
                list.printWordsOfChar(character);

            }
            else
            {
                System.out.println("you enter wrong data plz enter valid data");
            }
        }

    }
}
