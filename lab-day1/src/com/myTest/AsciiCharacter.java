package com.myTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AsciiCharacter {

    public static void main(String[] args) {

        for(int i=0; i<=255; i++){
            char ch = (char)i;
            System.out.println(i+"\t" +ch);
        }
    }

    public static class Exception {
        public static void main(String[] args) {

            try(Scanner scanner = new Scanner(System.in)) {

                System.out.println("Enter the value of x");
                int x = scanner.nextInt();
                System.out.println("Enter the value of y");
                int y = scanner.nextInt();

                int z = x / y;
                System.out.println("Result is :" + z);
            }
            catch (ArithmeticException ae) {
                System.out.println("Divisible is not Ok");
            }
            catch (InputMismatchException ime){
                System.out.println("Integer value is expected");
            }
            finally {
                System.out.println("Done");
            }
        }
    }
}
