package com.tcc.java.programs;

import java.util.Scanner;
public class DeleteWordFromSentence {
    public static void main(String args[]) {
        String sentence, word;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sentence");
        sentence = scanner.nextLine();

        System.out.println("Enter word you want to delete from Sentence");
        word = scanner.nextLine();
        sentence = sentence.replaceAll(word, "");

        System.out.println("Output Sentence\n" + sentence);
    }
}