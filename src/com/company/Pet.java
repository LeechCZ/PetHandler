package com.company;

public class Pet {

    private String name;
    private int age;
    private String gender;
    private String type;
    private int numberOfLegs;

    public Pet(String name, int age, String gender, String type, int numberOfLegs) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
        this.numberOfLegs = numberOfLegs;
    }

    public void walk(){
        System.out.println(name + " is walking");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
