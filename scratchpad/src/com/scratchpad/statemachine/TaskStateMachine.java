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
        State state = null;
        while (true) {
            printCurrentState(state);
            System.out.println("Please enter a command:");
            switch(getUserInput()) {
                case "start":
                    if (State.OPEN.equals(state)) {
                        state = State.IN_PROGRESS;
                    }
                    else {
                        System.out.println("This command can only be used in OPEN state");
                    }
                    break;
                case "complete":
                    state = State.AWAITING_APPROVAL;
                    break;
                case "accept":
                    state = State.FINISHED;
                    break;
                case "reject":
                    state = State.IN_PROGRESS;
                    break;
                default:
                    System.out.println("This is invalid input. Please try again.");
            }
        }
    }
    
    private void printCurrentState(State state) {
        System.out.println("Current state: " + state);
    }
    
    private String getUserInput() {
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        TaskStateMachine stateMachine = new TaskStateMachine();
        stateMachine.run();
    }
}
