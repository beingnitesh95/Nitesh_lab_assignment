package day1;

/*
 Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
 */
public class Q1 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3,sum = n1+n2;
        System.out.println("The fabonnaci numbers is: "+n1);
        System.out.println("The Fabonacci numbers is: "+n2);
        for(int i=2; i<=20; i++)
        {
           n3= n1+n2;
           n1 = n2;
           n2 = n3;
           sum = sum+n3;
           System.out.println("The fabonacci number is: "+n3);
        }
        System.out.println("Total sum of all fabonnaci series are: "+sum);
        float average = sum/20f;
        System.out.println("The average of sum is: "+average);
    }


}
