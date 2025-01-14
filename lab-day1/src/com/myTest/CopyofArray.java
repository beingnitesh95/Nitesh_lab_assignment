package com.myTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class CopyofArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Create a new array of length 7 by copying the original array
        int[] newArray = Arrays.copyOf(originalArray, 8);
        // Print the new array
        System.out.println(Arrays.toString(newArray));
    }

}