package org.howard.edu.lspfinal.question1;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple shopping cart that allows users to add and remove items, compute 
 * total cost, and apply discount codes.
 */
public class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();
    private double discountPercentage = 0.0;

    /**
     * Adds an item to the shopping cart.
     * @param itemName
     * @param price
     */
    public void addItem(String itemName, double price){

    }
    /**
     * Removes an item from the cart.
     * @param itemName
     */
    public void removeItem (String itemName){

    }

    /**
     * Returns the count of items in the cart.
     * @return number of items in the cart.
     */
    public int getItemCount(){
        return items.size();
    }


}
