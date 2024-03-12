package db;

import model.GymUser;

import java.util.ArrayList;
import java.util.List;

public class GymUserDatabase {
    private List<GymUser> gymUsers;

    private static GymUserDatabase instance ;

    public static GymUserDatabase getInstance() {
        if (instance == null) {
            instance = new GymUserDatabase();
        }
        return instance;
    }

    private GymUserDatabase() {
        gymUsers = new ArrayList<>();
    }

    public void addGymUser(GymUser gymUser) {
        gymUsers.add(gymUser);
    }
    public List<GymUser> getGymUsers() {
        return gymUsers;
    }
    public GymUser getGymUserByEmail(String email) {
        for (GymUser gymUser : gymUsers) {
            if (gymUser.getEmail().equalsIgnoreCase(email)) {
                return gymUser;
            }
        }
        throw new NullPointerException("User with this email " + email + " does not exist");
    }

}
