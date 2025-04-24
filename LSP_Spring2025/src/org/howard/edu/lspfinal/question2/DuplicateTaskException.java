package org.howard.edu.lspfinal.question2;
/**
 * Exception thrown when trying to add a new task with the same name as an existing one.
 */
public class DuplicateTaskException extends Exception{
    public DuplicateTaskException(String message) {
        super(message);
    }
}
