package controller;

import db.GymUserDb;
import model.GymUser;

import java.util.List;

public class GymUserController {
    private final GymUserDb gymUserDataBase = GymUserDb.getInstance();
    public String addGymUser(String name, int age, String phoneNumber, String email, String gender) {

//        if (name == null || phoneNumber == null || email ==null || gender == null) {
//            return "user can not be empty";
//        }
        if (age < 18 || age > 60) {
            return "You are outside the age bracket";
        }

        GymUser gymUser = new GymUser(name, age, phoneNumber, email, gender);
        gymUserDataBase.addGymUser(gymUser);
        return "Gym User Added";
    }

    public List<GymUser> getAllGymUsers() {
        return gymUserDataBase.getGymUsers();
    }

    public GymUser getGymUser(String email) {
        return gymUserDataBase.getGymUserByEmail(email);
    }
}
