
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        int sum= 0;
        int count = 0;
        int sumPassed = 0;
        int countPassed = 0;
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            
            int point = Integer.valueOf(scanner.nextLine());
            
            if (point == -1) {
                break;
            }
            
            if (point < 0 || point > 100) {
                continue;
            }
            
            if (point < 50) {
                grades.add(0);
            } else if (point < 60) {
                grades.add(1);
            } else if (point < 70) {
                grades.add(2);
            } else if (point < 80) {
                grades.add(3);
            } else if (point < 90) {
                grades.add(4);
            } else {
                grades.add(5);
            }
            
            if (point >= 50) {
                sumPassed += point;
                countPassed ++;
            }
            
            sum += point;
            count ++;
        }
        
        System.out.println("Point average (all): " + (double)sum / count);
        
        if (countPassed > 0) {
            System.out.println("Point average (passing): " + (double)sumPassed / countPassed);
        } else {
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: " + 100 * (double)countPassed / count);
        
        System.out.println("Grade distribution:");
        
        for (int grade = 5; grade >= 0; grade--) {
            
            int numberOfGrade = 0;
            
            for (int i = 0; i < grades.size(); i++) {
                
                if (grades.get(i) == grade) {
                    numberOfGrade++;
                }
            }
            
            System.out.print(grade + ": ");
            
            for (int i = 0; i < numberOfGrade; i++) {
                System.out.print("*");
            }
            
            System.out.println("");
        } 
    }
}
