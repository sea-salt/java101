package com.scratchpad.statemachine;

import java.util.Scanner;

/**
 * Exercise
 * --------
 * {initial state} -> Open
 * "start" -> InProgress
 * "complete" -> AwaitingApproval
 * "reject" -> InProgress
 * "accept" -> Finished
 * 
 * Print out the current state after each user input
 * If the input is invalid, tell the user and allow them to try again
 * 
 * Legend
 * --------
 * user_input -> State
 * user_input is a String
 * -> means 'results in'
 * You figure out what data type State should be!
 */
public class TaskStateMachine {
    private Scanner scanner;
    
    public TaskStateMachine() {
        scanner = new Scanner(System.in);
    }
    
    public void run() {
        // TODO: Implement state machine here!
    }
    
    private void printCurrentState() {
        System.out.println("Current state: ");
    }
    
    private String getUserInput() {
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        TaskStateMachine stateMachine = new TaskStateMachine();
        stateMachine.run();
    }
}
