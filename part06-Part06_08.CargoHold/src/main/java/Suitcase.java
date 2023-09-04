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

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }
        
        int totalWeight = 0;
        
        for (Item item: items) {
            totalWeight += item.getWeight();
        }
        return this.items.size() + " items (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item item: items) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for (Item item: items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
}
