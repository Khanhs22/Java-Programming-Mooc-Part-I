
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        System.out.println("The greatest number:" + greatest(list));
    }
    
    public static int greatest(ArrayList<Integer> numbers) {
        
        int greatestNumber = numbers.get(0);
        
        for (int i = 1; i <= numbers.size() - 1; i++) {
            
            if (greatestNumber < numbers.get(i)) {
                greatestNumber = numbers.get(i);
            }
        }
        
        return greatestNumber;
    }
}
