package com.arieljtyson.rest.Models;

public class User {

    private long id;
    private String firstName;
    private String lastName;

    private int age;

    private String occupation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int num) {
        this.age = num;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String name) {
        this.occupation = name;
    }
}
