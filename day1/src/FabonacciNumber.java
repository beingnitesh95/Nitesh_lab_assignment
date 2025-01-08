public class FabonacciNumber {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int n3;
        int sum = n1+n2;
        System.out.println("Fabonacci number is: "+n1);
        System.out.println("Fabonacci number is: "+n2);

        for (int i=2; i<=20; i++){
            n3 = n1+n2;
            //System.out.println("Sum is: "+sum);
            n1 = n2;
            n2= n3;
            sum += n3;
            System.out.println("Fabonacci number is: "+n3);
        }
        double average = sum/20f;
        System.out.println("The average is: "+average);
    }
}
