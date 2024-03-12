package view;

import controller.GymUserController;

import java.util.Scanner;

public class IFitnessView {
    private Scanner scanner =  new Scanner(System.in);
    private GymUserController gymuserController = new GymUserController();

    public IFitnessView(){
        start();
    }
    public void start(){
        while(true){
            System.out.println("""
                    Welcome to IFitness
                    +-----------------------------------------------------+
                    1. Register  
                    2. Exit                                          
                                                                         
                    """
                    );

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    register();
                    break;
                case 2:

                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
    }

    }

    public void register(){
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your gender");
        String gender = scanner.next();
        System.out.println("Enter your phone number");
        String phoneNumber = scanner.next();
        System.out.println("Enter your email");
        String email = scanner.next();

//        String name, int age, String phoneNumber, String email, String gender

        gymuserController.addGymUser(name,age,phoneNumber,email,gender);
    }

}
