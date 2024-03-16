package controller;

import db.GymInstructorDb;
import model.GymInstructor;

public class GymInstructorController {
    private final GymInstructorDb gymInstructorDb = GymInstructorDb.getInstance();

    public void addGymInstructor(String name) {
        GymInstructor gymInstructor = new GymInstructor(name);
        gymInstructorDb.addGymInstructor(gymInstructor);
    }

    public GymInstructor getGymInstructorByName(String name) {
        return gymInstructorDb.getGymInstructorByName(name)
                .orElseThrow(() -> new IllegalArgumentException("Instructor with name " + name + " does not exist"));
    }
}