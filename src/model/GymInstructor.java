package model;

public class GymInstructor {
    private static int nextId = 1; // Static variable to keep track of the next available id
    private final int id;
    private final String name;

    public GymInstructor(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GymInstructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}