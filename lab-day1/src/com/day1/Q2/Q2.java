package com.day1.Q2;
/*
    Write a program called GradesAverage, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the
grades of each of the students and saves them in an int array called grades. Your program shall
check that the grade is between 0 and 100. A sample session is as follow:
Enter the number of students: 3
Enter the grade for student 1: 55
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is: 56.0
 */

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for the number of students
    System.out.print("Enter the number of students: ");
    int numStudents = scanner.nextInt();

    // Create an array to store the grades of the students
    int[] grades = new int[numStudents];

    // Loop to get the grades for each student
    for (int i = 0; i < numStudents; i++) {
      while (true) {
        // Prompt the user for the grade of the current student
        System.out.print("Enter the grade for student " + (i + 1) + ": ");
        int grade = scanner.nextInt();

        if (grade >= 0 && grade <= 10) {
          grades[i] = grade;
          break;
        } else {
          // Display an error message if the grade is invalid
          System.out.println("Invalid grade, try again...");
        }
      }
    }

    // Calculate the average grade
    double total = 0;
    for (int grade : grades) {
      total += grade;
    }
    double average = total / numStudents;
    System.out.println("The average is: " + average);
  }
}
