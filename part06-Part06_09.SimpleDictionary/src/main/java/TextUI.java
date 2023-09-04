/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        while (true) {
            
            System.out.print("Commad: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                
                System.out.print("Word: ");
                String word = scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                dictionary.add(word, translation);
                continue;
            }
            
            if (command.equals("search")) {
                
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                
                if (dictionary.translate(search) == null) {
                    
                    System.out.println("Word " + search + " was not found");
                } else {
                    
                    System.out.print("Translation: ");
                    System.out.println(dictionary.translate(search));
                }
 
                continue;
            }
            
            System.out.println("Unknown command");
        }
    }
}
