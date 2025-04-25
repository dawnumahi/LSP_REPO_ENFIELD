package org.howard.edu.lspfinal.question2;
/**
 * Class for an individual Task with a name, priority, and status.
 */
public class Task {
    private final String taskName;
    private final int priority;
    private String status; 

    /**
     * Constructor for a new Task. 
     * @param name
     * @param priority
     * @param status
     */
    public Task(String name, int priority, String status) {
        this.taskName = name;
        this.priority = priority;
        this.status = status;
    }

    public String getName(){
        return this.taskName;
    }

    public int getPriority(){
        return this.priority;
    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String s){
        this.status = s;
    }

    /**
     * toString method for Tasks.
     */
    @Override
    public String toString() {
        return "Task :" + taskName + ", Priority= " + priority + ", Status " + status ;
    }
}
