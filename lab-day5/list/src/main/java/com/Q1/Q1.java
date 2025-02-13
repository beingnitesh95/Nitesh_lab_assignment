package com.Q1;
/*
Q1. create a file story.txt and put some text into it. read that file and find the frequency of each word in the file in the
and print it
Ex:
story.txt
life is full of fun life is full of fun life is full of fun life
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
        public static void main(String[] args) {
            Map<String, Integer> wordCount = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\SE\\lab-day5\\list\\src\\main\\resources\\Story.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+"); // Split by spaces

                    // Loop through each word and count frequency
                    for (String word : words) {
                        word = word.toLowerCase();  // Ignore case differences
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }

                // Print the frequency of each word
                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

