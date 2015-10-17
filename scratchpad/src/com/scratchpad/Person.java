package com.scratchpad;

public class Person {
    private static int numberOfPeople;
    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String direction;

    public Person(int age, String firstName, String lastName) {
        numberOfPeople++;
        id = numberOfPeople;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstName = firstName;
        direction = "North";
        getNumberOfPeople();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;

    }

    public String getDirection() {
        return direction;
    }

    public void turnLeft() {
        if (direction.equals("North")) {
            direction = "West";
        }
        else if (direction.equals("West")) {
            direction = "South";
        }
        else if (direction.equals("South")) {
            direction = "East";
        }
        else {
            direction = "North";
        }

    }

    public void turnRight() {
        for (int i = 0; i < 3; i++) {
            turnLeft();

        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }
}
