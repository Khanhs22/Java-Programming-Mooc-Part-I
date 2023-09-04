
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }

    public static void removeLast(ArrayList<Integer> list) {
        
        int lastIndex = list.size() - 1;
        
        if (lastIndex == -1) {
            return;
        }
        
        list.remove(lastIndex);
    }
}
