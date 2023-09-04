
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String file = scan.nextLine();
        String team = scan.nextLine();
        int games = 0;
        int win = 0;
        int lose = 0;
        
        try (Scanner scanTeam = new Scanner(Paths.get(file))) {
            
            while (scanTeam.hasNextLine()) {
                
                String line = scanTeam.nextLine();
                
                String[] parts = line.split(",");
                
                if (team.equals(parts[0]) || team.equals(parts[1])) {
                    games++;
                    
                    if (team.equals(parts[0]) && 
                            (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3]))) {
                        win++;
                    } else if (team.equals(parts[1]) && 
                            (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2]))) {
                        win++;
                    } else {
                        lose++;
                    }
                }
            }
            
            System.out.println("Games: " + games);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lose);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
