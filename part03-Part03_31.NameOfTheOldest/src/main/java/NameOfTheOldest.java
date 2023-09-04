
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String nameOfOldest = "";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            if (max < Integer.valueOf(parts[1])) {
                max = Integer.valueOf(parts[1]);
                nameOfOldest = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
