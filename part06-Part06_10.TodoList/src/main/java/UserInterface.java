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

public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        
        while (true) {
            
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                
                this.todoList.add(task);
            }
            
            if (command.equals("list")) {
                
                this.todoList.print();
            }
            
            if (command.equals("remove")) {
                
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(number);
            }
        }
    }
}
