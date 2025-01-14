package com.day1;
import java.util.Arrays;

/*
    Write a method called copyOf(), which accept an int array and returns a copy of the given array.
The method's signature is as follows:
public static int[] copyOf(int[] array)
 */
public class Q3 {

    public static int[] copyOf(int[] array){
        return Arrays.copyOf(array, array.length);
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 5, 7, 9};

        int[] copiedArray = copyOf(originalArray);
        System.out.println("Original array are: ");
        for(int num: copiedArray){
            System.out.println(num);
        }

    }



}
