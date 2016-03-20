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
    private State currentState;

    public TaskStateMachine() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        currentState = State.OPEN;
        outerloop:
        while (true) {
            printCurrentState();
            System.out.println("Please enter a command:");
            switch(getUserInput()) {
                case "start":
                    if (State.OPEN.equals(currentState)) {
                        currentState = State.IN_PROGRESS;
                    }
                    else {
                        System.out.println("This command can only be used in state: OPEN");
                    }
                    break;
                case "complete":
                    if (State.IN_PROGRESS.equals(currentState)) {
                        currentState = State.AWAITING_APPROVAL;
                    }
                    else {
                        System.out.println("This command can only be used in state: IN_PROGRESS");
                    }
                    break;
                case "accept":
                    if (State.AWAITING_APPROVAL.equals(currentState)) {
                        currentState = State.FINISHED;
                        break outerloop;
                    }
                    else {
                        System.out.println("This command can only be used in state: AWAITING_APPROVAL");
                    }
                    break;
                case "reject":
                    if (State.AWAITING_APPROVAL.equals(currentState)) {
                        currentState = State.IN_PROGRESS;
                    }
                    else {
                        System.out.println("This command can only be used in state: AWAITING_APPROVAL");
                    }
                    break;
                default:
                    System.out.println("This is invalid input. Please try again.");
            }
        }
        // Print the final state before the program exits
        printCurrentState();
    }
    
    private void printCurrentState() {
        System.out.println("Current state: " + currentState);
    }
    
    private String getUserInput() {
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        TaskStateMachine stateMachine = new TaskStateMachine();
        stateMachine.run();
    }
}
