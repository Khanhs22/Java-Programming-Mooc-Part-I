
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Factorial: " + factorial(number));
    }
    
    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        
        return x * factorial(x - 1);
    }
}
