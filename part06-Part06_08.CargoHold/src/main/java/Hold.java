/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int weight = 0;
        
        for (Suitcase check: this.suitcases) {
            weight += check.totalWeight();
        }
        
        if (weight + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }     
    }
    
    public String toString() {
        int weight = 0;
        
        for (Suitcase suitcase: this.suitcases) {
            weight += suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + weight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
}
