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
            throw new DuplicateTaskException("Task " + n + " already exists.");
        }
        tasks.put(n, new Task(n, p, s));
    }

    /**
     * Method to get a tesk by name.
     * @param n
     * @return Returns the task.
     * @throws TaskNotFoundException
     */
    public Task getTaskByName(String n) throws TaskNotFoundException{
        Task t = tasks.get(n);
        if (t == null){
            throw new TaskNotFoundException( " " + n + " not found.");
        }
        return t;
    }

    /**
     * Updates the status of the task named.
     * @param n
     * @param updatedStatus
     * @throws TaskNotFoundException
     */
    public void updateStatus(String n, String updatedStatus) throws TaskNotFoundException{
        Task t = getTaskByName(n);
        t.setStatus(updatedStatus);
    }

   /**
    * Groups tasks by status and prints them out.
    */
    public void printTasksGroupedByStatus() {
        System.out.println("Tasks grouped by status:");
        List<String> statuses = Arrays.asList("TODO", "IN_PROGRESS", "DONE");
        for (String status : statuses) {
            System.out.println(status + ": ");
            for (Task t : tasks.values()) {
                if (t.getStatus().equals(status)) {
                    System.out.println("  " + t);
                }
            }
        }
    }

}
