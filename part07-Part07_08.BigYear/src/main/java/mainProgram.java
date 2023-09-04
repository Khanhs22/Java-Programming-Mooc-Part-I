
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true) {
            
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                
                System.out.print("Name: ");
                String name = scan.nextLine();
                
                System.out.print("Name in Latin: ");
                String nameInLatin = scan.nextLine();
                
                birds.add(new Bird(name, nameInLatin));
            }
            
            if (command.equals("All")) {
                
                printAll(birds);
            }
            
            if (command.equals("One")) {
                
                System.out.print("Bird? ");
                String name = scan.nextLine();
                
                printOne(name, birds);
            }
            
            if (command.equals("Observation")) {
                
                System.out.println("Bird? ");
                String name = scan.nextLine();
                
                observate(name, birds);
            }
        }
    }
    
    public static void printAll(ArrayList<Bird> birds) {
        
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public static void printOne(String name, ArrayList<Bird> birds) {
        
        for (Bird bird : birds) {
            
            if (bird.getName().equals(name)) {
                
                System.out.println(bird);
                break;
            }
        }
    }
    
    public static void observate(String name, ArrayList<Bird> birds) {
        
        for (Bird bird: birds) {
            
            if (bird.getName().equals(name)) {
                
                bird.observate();
                break;
            }
        }
    }
}
