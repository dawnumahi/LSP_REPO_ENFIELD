package org.howard.edu.lspfinal.question2;
import java.util.*;

/**
 * Task manager to add, retrieve, update, and print tasks. 
 */
public class TaskManager {
    private Map<String, Task> tasks = new HashMap<>();
    
    /**
     * Adds a new task with a unique name.
     * @param n
     * @param p
     * @param s
     * @throws DuplicateTaskException
     */
    public void addTask(String n, int p, String s) throws DuplicateTaskException{
        if(tasks.containsKey(n)){
            throw new DuplicateTaskException("Task '" + n + "' already exists.");
        }
        tasks.put(n, new Task(n, p, s));
    }
}
