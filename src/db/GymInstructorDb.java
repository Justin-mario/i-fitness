package db;

import model.GymInstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GymInstructorDb {
    private static GymInstructorDb instance;
    private final List<GymInstructor> gymInstructors;

    public static GymInstructorDb getInstance() {
        if (instance == null) {
            instance = new GymInstructorDb();
        }
        return instance;
    }

    private GymInstructorDb() {
        gymInstructors = new ArrayList<>();
    }

    public void addGymInstructor(GymInstructor gymInstructor) {
        gymInstructors.add(gymInstructor);
    }

    public List<GymInstructor> getGymInstructors() {
        return gymInstructors;
    }

    public Optional<GymInstructor> getGymInstructorByName(String name) {
        return gymInstructors.stream()
                .filter(gymInstructor -> gymInstructor.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}