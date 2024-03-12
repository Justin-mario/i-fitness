package controller;

import model.GymUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



class GymUserControllerTest {

    @Test
    @DisplayName("Test that a new gym user can be added")
    void addGymUserTest() {
        GymUser gymUser = new GymUser( "Ben", 25, "075687665", "ben@gmail.com","Male");
        GymUserController gymUserController = new GymUserController();
        String message = "Gym User Added";
        String result = gymUserController.addGymUser(gymUser);
        assertEquals(message, result);
    }

    @Test
    @DisplayName("Test that a user with in the age bracket can be added")
    void addGymUserWithInAgeBracketTest() {
        GymUser gymUser = new GymUser( "Ben", 25, "075687665", "ben@gmail.com","Male");
        GymUserController gymUserController = new GymUserController();
        String message = "Gym User Added";
        String result = gymUserController.addGymUser(gymUser);
        assertEquals(message, result);
    }
    @Test
    @DisplayName("Test that an underage user can not register")
    void underAgeUserCanNotRegisterTest() {
        GymUser gymUser = new GymUser( "Ben", 17, "075687665", "ben@gmail.com","Male");
        GymUserController gymUserController = new GymUserController();
        String message = "You are outside the age bracket";
        String result = gymUserController.addGymUser(gymUser);
        assertEquals(message, result);
    }
    @Test
    @DisplayName("Test that null property should not be saved")
    void nullPropertyShouldNotBeSavedTest() {
        GymUserController gymUserController = new GymUserController();
        String message = "user can not be empty";
        String result = gymUserController.addGymUser(null);
        assertEquals(message, result);
    }


}