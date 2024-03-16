package view;

import controller.GymInstructorController;
import controller.GymUserController;
import model.GymInstructor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IFitnessView {
    private final Scanner scanner = new Scanner(System.in);
    private final GymUserController gymUserController = new GymUserController();
    private final GymInstructorController gymInstructorController = new GymInstructorController();

    public IFitnessView() {
        start();
    }

    public void start() {
        while (true) {
            System.out.println("""
                    Welcome to IFitness
                    +-----------------------------------------------------+
                    1. Register User
                    2. Register Instructor
                    3. Print Instructor Report
                    4. Print User Report
                    5. Exit
                    +-----------------------------------------------------+
                    """);
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> registerInstructor();
                case 3 -> printInstructorReport();
                case 4 -> printUserReport();
                case 5 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private void registerUser() {
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age;
        try {
            age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for age. Please enter a number.");
            scanner.nextLine(); // Consume the invalid input
            return;
        }
        System.out.println("Enter your gender");
        String gender = scanner.nextLine();
        System.out.println("Enter your phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        String message = gymUserController.addGymUser(name, age, phoneNumber, email, gender);
        System.out.println(message);
        System.out.println(gymUserController.getAllGymUsers());
    }

    private void registerInstructor() {
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        gymInstructorController.addGymInstructor(name);
        System.out.println("Instructor added");
    }

    private void printInstructorReport() {
        System.out.println("Enter instructor's name");
        String name = scanner.nextLine();
        try {
            GymInstructor instructor = gymInstructorController.getGymInstructorByName(name);
            System.out.println(instructor);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void printUserReport() {
        System.out.println("Enter user's email");
        String email = scanner.nextLine();
        System.out.println(gymUserController.getGymUser(email));
    }
}