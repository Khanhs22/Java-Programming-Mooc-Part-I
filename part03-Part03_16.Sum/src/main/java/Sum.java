
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }

    public static int sum(ArrayList<Integer> list) {
        
        int sumOfList = 0;
        for (int number: list) {
            sumOfList += number;
        }
        
        return sumOfList;
    }
}
