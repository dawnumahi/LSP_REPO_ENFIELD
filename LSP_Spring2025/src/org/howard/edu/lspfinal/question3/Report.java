package org.howard.edu.lspfinal.question3;

/**
 * Defining the template for generating any report. 
 */
public abstract class Report {
    /**
     * Workflow: Load, format, and print data. 
     */

    public void generateReport(){
        loadData();
        formatData();
        printReport();
        System.out.println();
    }
        
    protected abstract void loadData();
    protected abstract void formatData();
    protected abstract void printReport();

    //Source: https://refactoring.guru/design-patterns/template-method/java/example
}
