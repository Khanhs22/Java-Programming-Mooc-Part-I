
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> list,
            int small, int large) {

        for (int i = 0; i <= list.size() - 1; i++) {
            
            if (list.get(i) >= small && list.get(i) <= large) {
                System.out.println(list.get(i));
            }
        }
    }
}
