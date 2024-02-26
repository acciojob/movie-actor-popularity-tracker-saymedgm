
package com.driver;
import java.util.*;

public class MovieActorPopularityTracker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Queue<Actor> actorQueue = new LinkedList<>();
        Deque<Actor> actorDeque = new ArrayDeque<>();

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enqueueActor(scanner, actorQueue);
                    break;
                case 2:
                    dequeueActor(actorDeque);
                    break;
                case 3:
                    displayActors(actorDeque);
                    break;
                case 4:
                    increasePopularity(scanner, actorDeque);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }


    public static void printMenu() {
    	//your code goes here
    }

    public static void enqueueActor(Scanner scanner, Queue<Actor> queue) {
    	//your code goes here
    }

    public static void dequeueActor(Deque<Actor> deque) {
    	//your code goes here
    }

    public static void displayActors(Deque<Actor> deque) {
    	//your code goes here
    }

    public static void increasePopularity(Scanner scanner, Deque<Actor> deque) {
    	//your code goes here
    }
}

