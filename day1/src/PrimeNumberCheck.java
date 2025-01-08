import java.util.Scanner;

public class PrimeNumberCheck {
    public static boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(10));
    }
}
