
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNegative = 0;
        int negative = 0;
        
        while (true) {
            
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sumOfNegative += number;
                negative++;
            }
        }
        
        if (negative == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        
        System.out.println((double)sumOfNegative / negative);
    }
}
