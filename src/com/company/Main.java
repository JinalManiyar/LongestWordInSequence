package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence:");
        String sentence = sc.nextLine();
        String longestWord = getLongestWord(sentence);
        System.out.println("Longest word in the sentence is:"+longestWord);
    }
    private static String getLongestWord(String sentence) {
        int length = 0;
        String longestWord = null;

        String[] words = sentence.split(" ");

        for(String word:words){
            if(length < word.length()) {
                longestWord = word;
            }}
        return longestWord;
    }
}
