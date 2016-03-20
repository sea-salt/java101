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
                    setCurrentState(State.OPEN, State.IN_PROGRESS);
                    break;
                case "complete":
                    setCurrentState(State.IN_PROGRESS, State.AWAITING_APPROVAL);
                    break;
                case "accept":
                    setCurrentState(State.AWAITING_APPROVAL, State.FINISHED);
                    if (State.FINISHED.equals(currentState)) {
                        break outerloop;
                    }
                    break;
                case "reject":
                    setCurrentState(State.AWAITING_APPROVAL, State.IN_PROGRESS);
                    break;
                default:
                    System.out.println("This is invalid input. Please try again.");
            }
        }
        // Print the final state before the program exits
        printCurrentState();
    }
    
    private void setCurrentState(State requiredState, State newState) {
        if (requiredState.equals(currentState)) {
            currentState = newState;
        }
        else {
            System.out.println("This command can only be used in state: " + requiredState);
        }
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
