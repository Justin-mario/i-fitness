package controller;

import db.GymUserDatabase;
import model.GymUser;

public class GymUserController {
    private final GymUserDatabase gymUserDataBase = GymUserDatabase.getInstance();
    public String addGymUser(String name, int age, String phoneNumber, String email, String gender) {

        if (name == null || phoneNumber == null || email ==null || gender == null) {
            return "user can not be empty";
        }
        if (age < 18 || age > 60) {
            return "You are outside the age bracket";
        }

        GymUser gymUser = new GymUser(name, age, phoneNumber, email, gender);
        gymUserDataBase.addGymUser(gymUser);
        return "Gym User Added";
    }

}
