
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
        System.out.println("Choose an option:");
        System.out.println("1. Enqueue Actor");
        System.out.println("2. Dequeue Actor");
        System.out.println("3. Display Actors");
        System.out.println("4. Increase Popularity");
        System.out.println("5. Exit");
    }

    public static void enqueueActor(Scanner scanner, Queue<Actor> queue) {
        System.out.println("Enter actor name: ");
        String name = scanner.next();
        queue.offer(new Actor(name, 0));
        System.out.println(name + " added to the queue.");
    }

    public static void dequeueActor(Deque<Actor> deque) {
        Actor removedActor = deque.pollFirst();
        if (removedActor != null) {
            System.out.println(removedActor.getName() + " dequeued.");
        } else {
            System.out.println("No actors to dequeue.");
        }
    }

    public static void displayActors(Deque<Actor> deque) {
        if (deque.isEmpty()) {
            System.out.println("No actors to display.");
        } else {
            System.out.println("Actors in the deque:");
            for (Actor actor : deque) {
                System.out.println(actor);
            }
        }
    }

    public static void increasePopularity(Scanner scanner, Deque<Actor> deque) {
        System.out.println("Enter actor name to increase popularity: ");
        String name = scanner.next();
        for (Actor actor : deque) {
            if (actor.getName().equalsIgnoreCase(name)) {
                actor.increasePopularity();
                System.out.println(actor.getName() + " popularity increased.");
                return;
            }
        }
        System.out.println("Actor not found.");
    }
}
