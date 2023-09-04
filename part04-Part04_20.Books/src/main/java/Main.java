import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookInfo = new ArrayList<>();
        
        while (true) {
            
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            bookInfo.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed?");
        
        String information = scanner.nextLine();
        
        if (information.equals("everything")) {
            for (Book info: bookInfo) {
                System.out.println(info);
            }
        }
        
        if (information.equals("name")) {
            for (Book info: bookInfo) {
                System.out.println(info.getTitle());
            }
        }
    }
}
