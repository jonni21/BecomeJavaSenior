package task16;

import java.util.Scanner;

public class Human {

    final int MIN_AGE = 10;
    final int MAX_AGE = 100;
    final double MIN_HEIGHT = 50.0;
    final double MAX_HEIGHT = 250.0;
    final double MIN_WEIGHT = 30.0;
    final double MAX_WEIGHT = 300.0;

    private String sex;
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.matches("[a-zA-Z]{3,15}")) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public String getSex() {
        return sex;
    }

    public boolean setSex(String sex) {
        if (sex.matches("male|female")) {
            this.sex = sex;
            return true;
        } else {
            return false;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if ((age >= MIN_AGE) && (age <= MAX_AGE)) {
            this.age = age;
            return true;
        } else {
            return false;
        }
    }

    public double getWeight() {
        return weight;
    }

    public boolean setWeight(double weight) {
        if ((weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT)) {
            this.weight = weight;
            return true;
        } else {
            return false;
        }
    }

    public double getHeight() {
        return height;
    }

    public boolean setHeight(double height) {
        if ((height >= MIN_HEIGHT) && (height <= MAX_HEIGHT)) {
            this.height = height;
            return true;
        } else {
            return false;
        }
    }

}