package org.howard.edu.lspfinal.question3;

public class Driver {
    public static void main(String[] args) {
        Report inventory = new InventoryReport();
        inventory.generateReport();

        Report sales = new SalesReport();
        sales.generateReport();
    }
}
