package com.java11and17;

public class C_PatternMatching_instanceOfOpImprovement {

        // A method that checks the type of an object and prints a message
        public static void checkType(Object obj) {
            // Using pattern matching with instanceof to check type and bind variables
            if (obj instanceof String str) {
                System.out.println("It's a String: " + str);
            } else if (obj instanceof Integer num) {
                System.out.println("It's an Integer: " + num);
            } else if (obj instanceof Double d) {
                System.out.println("It's a Double: " + d);
            } else {
                System.out.println("Unknown type");
            }
        }

        public static void main(String[] args) {
            // Test the checkType method with different object types
            checkType("Hello, world!");    // String case
            checkType(33);                 // Integer case
            checkType(3.33);               // Double case
            checkType(true);               // Unknown type case
        }

}
