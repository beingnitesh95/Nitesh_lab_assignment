package com.myTest;

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        while(num!=0){
            num /= 10;
            count++;
        }
        System.out.println("The count of number is: "+count);
    }
}
