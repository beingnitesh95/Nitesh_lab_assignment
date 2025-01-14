package com.myTest;

public class FactorialUsingMethod {

    public static int factorial(int num){
        int factorial = 1;

        // Loop to compute factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Return the computed factorial
        return factorial;
    }

    public static void main(String[] args) {
        // Calling the factorial method and printing the result
        int result = factorial(10);
        System.out.println("The Factorial of the number is: " + result);
    }
}
