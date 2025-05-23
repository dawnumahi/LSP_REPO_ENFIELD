package org.howard.edu.lspfinal.question3;

/**
 * Creating a report for the Sales department.
 */
public class SalesReport extends Report {
    @Override
    protected void loadData(){
        System.out.println("Loading sales data...");
    }

    @Override
    protected void formatData(){
        System.out.println("Formatting sales data...");
    }

    @Override
    protected void printReport(){
        System.out.println("Printing sales data...");
    }

    //Source: https://refactoring.guru/design-patterns/template-method/java/example
}
