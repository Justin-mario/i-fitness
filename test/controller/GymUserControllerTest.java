package controller;

import model.GymUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



class GymUserControllerTest {

    @Test
    @DisplayName("Test that a new gym user can be added")
    void addGymUserTest() {
        GymUserController gymUserController = new GymUserController();
        String message = "Gym User Added";
        String result = gymUserController.addGymUser("Ben", 25, "075687665", "ben@gmail.com","Male");
        assertEquals(message, result);
    }

    @Test
    @DisplayName("Test that a user with in the age bracket can be added")
    void addGymUserWithInAgeBracketTest() {
        GymUserController gymUserController = new GymUserController();
        String message = "Gym User Added";
        String result = gymUserController.addGymUser("Ben", 25, "075687665", "ben@gmail.com","Male");
        assertEquals(message, result);
    }
    @Test
    @DisplayName("Test that an underage user can not registerUser")
    void underAgeUserCanNotRegisterTest() {
        GymUserController gymUserController = new GymUserController();
        String message = "You are outside the age bracket";
        String result = gymUserController.addGymUser("Ben", 17, "075687665", "ben@gmail.com","Male");
        assertEquals(message, result);
    }
    @Test
    @DisplayName("Test that null property should not be saved")
    void nullPropertyShouldNotBeSavedTest() {
        GymUserController gymUserController = new GymUserController();
        String message = "user can not be empty";
        String result = gymUserController.addGymUser(null, 25, null, null,null);
        assertEquals(message, result);
    }


}