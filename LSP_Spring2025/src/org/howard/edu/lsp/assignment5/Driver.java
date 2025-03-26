package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args){
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // Testing tostring
        System.out.println("Set 1:" + set1.toString()); 
        System.out.println("Set 2:" + set2.toString());

        //Testing smallest
        System.out.println("Smallest value in Set 1 is:" + set1.smallest());
        System.out.println("Smallest value in Set 2 is:" + set2.smallest());

        //Testing largest
        System.out.println("Largest value in Set 1 is:" + set1.largest());
        System.out.println("Largest value in Set 2 is:" + set2.largest());
       
        //Testing length
        System.out.println("Length of Set 1: " + set1.length());
        System.out.println("Length of Set 2: " + set2.length());

        //Testing add
        System.out.println("Adding 5 to Set 1...");
        set1.add(5);
        System.out.println("Adding 8 to Set 2...");
        set2.add(8);

        //testing remove
        System.out.println("Removing 11 from Set 1..."); 
        set1.remove(11);
        System.out.println("Removing 8 from Set 2..."); 
        set2.remove(8);
        System.out.println("Removing 9 from Set 2..."); //There is no 9 in set 2
        set2.remove(9);
        System.out.println("Set 1:" + set1.toString());
        System.out.println("Set 2:" + set2.toString());

        //Contains
        System.out.println("Does Set 1 contain 2? " + set1.contains(2));
        System.out.println("Does Set 1 contain 5? " + set1.contains(5));
        System.out.println("Does Set 2 contain 9? " + set2.contains(9));

        //Intersect
        System.out.println("Intersection of Set 1 and Set 2");
        set1.intersect(set2);
        System.out.println("Set 1 after intersection: " + set1);

        //Clear
        System.out.println("Clearing Set 1");
        set1.clear();
        System.out.println("Set 1 after clear: " + set1);

        // Testing isEmpty
        System.out.println("Is Set1 empty? " + set1.isEmpty());

        System.out.println("Adding 1, 2, 3, 4 to Set 1...");
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        System.out.println("Set 1: " + set1);
        // Testing isEmpty
        System.out.println("Is Set1 empty? " + set1.isEmpty());

        // Testing equals 
        System.out.println("Does Set 1 equal Set 2? " + set1.equals(set2));

        //Testing diff
        System.out.println("Difference of Set 1 and Set 2");
        set1.diff(set2);  // Set 1 - Set 2
        System.out.println("Set 1 after difference: " + set1);

        //Union and toString
        System.out.println("Union of Set 1 and Set 2");
        System.out.println("Value of Set 1 is:" + set1.toString());
        System.out.println("Value of Set 2 is:" + set2.toString());
        set1.union(set2);	// union of set1 and set2
        System.out.println("Result of union of Set 1 and Set 2: " +  set1.toString());

        System.out.println("Value of Set 1 is:" + set1.toString());
        System.out.println("Value of Set 2 is:" + set2.toString());
       	
        System.out.println("Adding 8, 9, 10, 11 to Set 2...");
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(11);

        // Testing complement 
        System.out.println("Elements in set 2 but not in set 1");
        set1.complement(set2); 
        System.out.println("Set 1 after complement: " + set1);
    }
}
