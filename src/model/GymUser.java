package model;

public class GymUser {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private String gender;

    public GymUser(String name, int age, String phoneNumber, String email, String gender) {
        this.id ++;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString(){
        return "Name: " + name + " Age: " + age + " Phone Number: " + phoneNumber + " Email: " + email + " Gender: " + gender;
    }
}
