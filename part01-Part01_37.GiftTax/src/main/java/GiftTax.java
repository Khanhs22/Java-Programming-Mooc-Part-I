
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double tax;
        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scan.nextLine());
        if (valueOfGift < 5_000) {
            System.out.println("No tax!");
        } else if (valueOfGift < 25_000) {
            tax = 100 + (valueOfGift - 5000) * 0.08;
            System.out.println("Tax: " + tax);
        } else if (valueOfGift < 55_000) {
            tax = 1_700 + (valueOfGift - 25_000) * 0.1;
            System.out.println("Tax: " + tax);
        } else if (valueOfGift < 200_000) {
            tax = 4_700 + (valueOfGift - 55_000) * 0.12;
            System.out.println("Tax: " + tax);
        } else if (valueOfGift < 1_000_000) {
            tax = 22_100 + (valueOfGift - 200_000) * 0.15;
            System.out.println("Tax: " + tax);
        } else {
            tax = 142_100 + (valueOfGift - 1_000_000) * 0.17;
            System.out.println("Tax: " + tax);
        }
    }
}
