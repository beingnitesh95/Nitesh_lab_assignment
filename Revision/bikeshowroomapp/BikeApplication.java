import java.util.Scanner;

public class BikeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of bikes: ");
        int bikeQty = sc.nextInt();
        Bike bike = new Bike(bikeQty);

        while (true) {
            System.out.println("1. Order bikes\n2. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter the number of bikes ordered: ");
                int orderedQty = sc.nextInt();
                try {
                    bike.orderedQty(orderedQty);
                } catch (InvalidStockException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 2) {
                break;
            }

        }
        sc.close();
    }
}
