package com.myTest;
/*
 Reverse string using String builder class
 */
public class ReverseString {
    public static void main(String[] args) {
        //String s = "Nitesh";
        StringBuilder sb = new StringBuilder("Nitin");
        //sb = sb.append(s);
        sb = sb.reverse();
        System.out.println("reversed string is: " +sb);
    }
}
