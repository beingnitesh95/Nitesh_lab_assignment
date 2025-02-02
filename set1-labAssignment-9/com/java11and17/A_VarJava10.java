package com.java11and17;

public class A_VarJava10 {
        public static void main(String[] args) {
            var message = "Hello, Java 10!";  // 'message' is inferred as a String
            var number = 42;                  // 'number' is inferred as an int
            var price = 19.99;                // 'price' is inferred as a double

            System.out.println(message);      // Outputs: Hello, Java 10!
            System.out.println("Number: " + number);  // Outputs: Number: 42
            System.out.println("Price: " + price);    // Outputs: Price: 19.99
        }

}
