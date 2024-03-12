package controller;

import db.GymUserDatabase;
import model.GymUser;

public class GymUserController {
    private final GymUserDatabase gymUserDataBase = GymUserDatabase.getInstance();
    public String addGymUser(GymUser gymUser) {
        if (gymUser == null) {
            return "user can not be empty";
        }
        if (gymUser.getAge() < 18 || gymUser.getAge() > 60) {
            return "You are outside the age bracket";
        }
        gymUserDataBase.addGymUser(gymUser);
        return "Gym User Added";
    }
}
