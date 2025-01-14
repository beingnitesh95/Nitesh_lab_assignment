package com.day1;

/*
Create pascal triangle using 2D arrary
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
 */

public class Q4 {

        public static void main(String[] args) {
            int[][] triangle = new int[8][];

            for (int i = 0; i < 8; i++) {
                // Initialize the row with the size of i+1
                triangle[i] = new int[i + 1];

                // Fill the row with numbers from 1 to i+1
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = j + 1;
                }
            }

            // Print the Pascal's Triangle
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();  // Move to the next line after each row
            }
        }

}
