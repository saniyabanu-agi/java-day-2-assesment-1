package com.tcc.java.programs;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        String input;
        String[] words;
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sentence");
        input = scanner.nextLine();
  
        words = input.split(" ");
  
        System.out.println("Reversed Sentence");
        for (i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}