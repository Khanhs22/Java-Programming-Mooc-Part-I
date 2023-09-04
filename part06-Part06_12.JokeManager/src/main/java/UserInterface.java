
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dkhanh
 */
public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {

        while (true) {

            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {

                System.out.println("Write the joke to be added:");

                String joke = scanner.nextLine();
                this.manager.addJoke(joke);
            } else if (command.equals("2")) {

                System.out.println(this.manager.drawJoke());
            } else if (command.equals("3")) {

                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            }
        }
    }
}
