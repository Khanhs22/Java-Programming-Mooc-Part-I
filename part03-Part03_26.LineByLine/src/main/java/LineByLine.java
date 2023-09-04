
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String reading = scanner.nextLine();
            
            if (reading.equals("")) {
                break;
            }
            
            String[] pieces = reading.split(" ");

            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
    }
}
