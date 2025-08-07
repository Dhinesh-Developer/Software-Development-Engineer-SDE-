package com.exception;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class program5 {

    public static void displayAllWords(TreeSet<String> words) {
        System.out.println("All Words (Sorted):");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void displayCapitalizedPlurals(TreeSet<String> words) {
        System.out.println("Words with Capitalized Plurals:");
        for (String word : words) {
            if (word.endsWith("s")) {
                System.out.println(word.toUpperCase());
            } else {
                System.out.println(word);
            }
        }
    }

    public static void displayWordsInReverse(TreeSet<String> words) {
        System.out.println("Words in Reverse Order:");
        List<String> wordList = new ArrayList<>(words);
        Collections.reverse(wordList);
        for (String word : wordList) {
            System.out.println(word);
        }
    }

    public static void displayWordsExcludingPlurals(TreeSet<String> words) {
        System.out.println("Words Excluding Plurals:");
        for (String word : words) {
            if (!word.endsWith("s")) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> wordSet = new TreeSet<>();

        System.out.print("Enter number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter word " + i + ": ");
            String word = scanner.nextLine().trim().toLowerCase();
            wordSet.add(word); 
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display All Words");
            System.out.println("2. Display Words with Capitalized Plurals");
            System.out.println("3. Display Words in Reverse Order");
            System.out.println("4. Display Words Excluding Plurals");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayAllWords(wordSet);
                    break;
                case 2:
                    displayCapitalizedPlurals(wordSet);
                    break;
                case 3:
                    displayWordsInReverse(wordSet);
                    break;
                case 4:
                    displayWordsExcludingPlurals(wordSet);
                    break;
                case 5:
                    System.out.println("Exiting Program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
