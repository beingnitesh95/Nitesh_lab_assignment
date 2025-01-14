package com.day1;
/*
    Write a program to find next date
Input : enter day: 31
enter month: 12
enter year : 2022
today date: 31/12/2022
Next date: 1/1/2023
 */

import java.util.Scanner;

public class Q5 {

        // Function to check if a year is a leap year
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public static int getDaysInMonth(int month, int year) {
            // Array with the number of days in each month
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


            if (month == 2 && isLeapYear(year)) {
                return 29;
            }

            return daysInMonth[month - 1]; // Return the number of days for the given month
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter day: ");
            int day = scanner.nextInt();
            System.out.print("Enter month: ");
            int month = scanner.nextInt();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.println("Today's date: " + day + "/" + month + "/" + year);

            // Get the number of days in the current month
            int daysInMonth = getDaysInMonth(month, year);


            if (day < daysInMonth) {
                day++;
            } else {
                day = 1;
                if (month == 12) {
                    month = 1;
                    year++;
                } else {
                    month++;
                }
            }

            System.out.println("Next date: " + day + "/" + month + "/" +year);


        }
}