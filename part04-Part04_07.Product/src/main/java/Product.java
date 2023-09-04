/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class Product {

    private double price;
    private int quanity;
    private String name;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        
        this.name = initialName;
        this.price = initialPrice;
        this.quanity = initialQuantity;
    }
    
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quanity + " pcs");
    }
}
