
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = new ArrayList<>();

        readFile(file, recipes);

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {

            System.out.println("");
            System.out.print("Enter command: ");

            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {

                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            if (command.equals("find name")) {

                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");

                foundWord(word, recipes);
            }

            if (command.equals("find cooking time")) {

                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());

                System.out.println("");
                System.out.println("Recipes:");

                findTime(maxTime, recipes);
            }
            
            if (command.equals("find ingredient")) {
                
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                
                findIngredient(ingredient, recipes);
            }
        }
    }

    public static void readFile(String file, ArrayList<Recipe> recipes) {

        try ( Scanner scanFile = new Scanner(Paths.get(file))) {

            while (scanFile.hasNextLine()) {

                String name = scanFile.nextLine();
                int time = Integer.valueOf(scanFile.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (scanFile.hasNextLine()) {
                    
                    String row = scanFile.nextLine();
                    
                    if (row.isEmpty()) {
                        break;
                    }
                    
                    ingredients.add(row);
                }

                recipes.add(new Recipe(name, time, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void foundWord(String word, ArrayList<Recipe> recipes) {

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    public static void findTime(int maxTime, ArrayList<Recipe> recipes) {

        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public static void findIngredient(String ingredient, ArrayList<Recipe> recipes) {
        
        for (Recipe recipe: recipes) {
            
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
