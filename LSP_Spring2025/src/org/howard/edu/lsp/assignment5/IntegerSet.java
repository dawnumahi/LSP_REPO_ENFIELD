package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * The IntegerSet class represents a set of integers and provides set operations.
 * The set does not allow duplicates.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
    /**
     * Default Constructor for initializing empty sets.
     */
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
    /**
     * Constructor if you want to pass in an already initialized set.
     * 
     * @param set The set of integers being passed.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set. 5 pts.
    /**
     * Clears the internal representation of the set and removes all elements. 
     */
    public void clear() {
        set.clear();
    }

    // Returns the length of the set. 5 pts.
    /**
     * Returns the length of the set
     * @return set size.
     */
    public int length() {
        return set.size();
    } 

    /*
    * Returns true if the 2 sets are equal, false otherwise;
    * Two sets are equal if they contain all of the same values in ANY order.  This overrides
    * the equal method from the Object class. 10 pts.
    */

    /** 
     * Returns true if two sets are equal meaning they contain all of the same values in ANY order.
     * This overrides the equal method from the Object class.
     * @param o the object being checked for equality to the set.
     * @return true if the 2 sets are equal, false otherwise. 
     * Two sets 
     */
    public boolean equals(Object o) {
        if (o  == null){
            return false;
        }
        else if(getClass() != o.getClass()){
            return false;
        }
        IntegerSet other = (IntegerSet) o;
        return set.size() == other.set.size() && set.containsAll(other.set);
    }

    // Returns true if the set contains the value, otherwise false. 5 pts.
    /**
     * Returns true if the set contains the value, otherwise false.
     * 
     * @param value the integer to check for within the set.
     * @return true if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }    

    // Returns the largest item in the set. 5 pts.
    /**
     * Returns the largest item in the set.
     * 
     * @return the largest integer in the set. 
     */
    public int largest() {
        int largest = set.get(0);
        for(int num : set){
            if (num > largest){
                largest = num;
            }
        }
        return largest;
    }

    // Returns the smallest item in the set. 5 pts.
    /**
     * Returns the smallest item in the set.
     * 
     * @return the smallest integer in the set.
     */
    public int smallest()  {
        int smallest = set.get(0);
        for(int num : set){
            if (num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }

	// Adds an item to the set or does nothing it already there. 5 pts.	
    /**
     * Adds an item to the set or does nothing it already there.
     * 
     * @param item the integer to add to the set.
     */
 	public void add(int item) {
        if(!set.contains(item)){
            set.add(item);
        }
    }

	// Removes an item from the set or does nothing if not there. 5 pts.
    /**
     * removes an item from a set if it is present. 
     * 
     * @param item the integer to remove from the set.
     */
    public void remove(int item) {
        for(int i=0; i < set.size(); i++){
            if(set.get(i) == item){
                set.remove(i);
                return;
            }
        }
    }

    // Set union. 11 pts.
    /**
     * Adds all elements from set b to this set that are not already present.
     * 
     * @param intSetb set b 
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set){
            add(num);
        }
    }

    /**
     * Replaces contents of this set with elements present in both this
     * set and set b. 
     * 
     * @param intSetb set b.
     */
    // Set intersection, all elements in s1 and s2. 12 pts.
    public void intersect(IntegerSet intSetb) {
        List<Integer> temp = new ArrayList<>();

        for(int num : set){
            if(intSetb.contains(num)){
                temp.add(num);
            }
        }
        set.clear();
        set.addAll(temp);
    }

    // Set difference, i.e., s1 –s2. 12 pts.
    /**
     * Removes all elements present in set b from thi set.
     * 
     * @param intSetb set b
     */
    public void diff(IntegerSet intSetb){
        List<Integer> temp = new ArrayList<>();

        for(int num : set){
            if(!intSetb.contains(num)){
                temp.add(num);
            }
        }
        set.clear();
        set.addAll(temp);
    }

    // Set complement, all elements not in s1. 11 pts.
    /**
     * Replaces elements of this set with all elements present in set 
     * b but not in this set.
     * 
     * @param intSetb set b
     */
    public void complement(IntegerSet intSetb) { 
        List<Integer> temp = new ArrayList<>();

        for(int num : intSetb.set){
            if(!set.contains(num)){
                temp.add(num);
            }
        }
        set.clear();
        set.addAll(temp);
    }

    // Returns true if the set is empty, false otherwise. 5 pts.
    /**
     * Returns true if the set is empty, false otherwise.
     * 
     * @return true if the set is empty, false otherwise
     */
    boolean isEmpty(){
        return set.isEmpty();
    } 

    // Return String representation of your set.  This overrides the equal method from 
    // the Object class. 5 pts.
    /**
     * Return String representation of your set.  This overrides the equal method from 
     * the Object class.
     * 
     * @return the string representation of the set.
     */
    public String toString() {
        return set.toString();
    }

}
