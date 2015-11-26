package task16;

import java.util.Scanner;

public class Human {

    private String sex;
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHumanFromConsole() {

        final int MIN_AGE = 10;
        final int MAX_AGE = 100;
        final double MIN_HEIGHT = 50.0;
        final double MAX_HEIGHT = 250.0;
        final double MIN_WEIGHT = 30.0;
        final double MAX_WEIGHT = 300.0;

        String s;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        s = input.next();
        while ((!s.matches("[a-zA-Z]{3,15}"))) {
            System.out.println("Enter correct value (3 to 15 letters):");
            s = input.next();
        }
        this.name = s;

        System.out.println("Enter your sex (male/female):");
        s = input.next().toLowerCase();
        while (!(s.matches("male|female"))) {
            System.out.println("Please enter correct value (male or female):");
            s = input.next().toLowerCase();
        }
        this.sex = s;

        System.out.println("Enter your age:");
        s = input.next();
        while (true) {
            while (!(s.matches("\\d+"))) {
                System.out.println("Enter correct value from 10 to 100:");
                s = input.next();
            }
            int age = Integer.valueOf(s);
            if ((age >= MIN_AGE) && (age <= MAX_AGE)) {
                this.age = age;
                break;
            } else {
                System.out.println("Enter correct value from 10 to 100:");
                s = input.next();
            }
        }

        System.out.println("Enter your height in cm:");
        s = input.next();
        while (true) {
            while (!(s.matches("\\d+[\\.,]?\\d+"))) {
                System.out.println("Enter correct value from 50 to 250:");
                s = input.next();
            }
            s = s.replace(",", ".");
            double height = Double.valueOf(s);
            if ((height >= MIN_HEIGHT) && (height <= MAX_HEIGHT)) {
                this.height = height;
                break;
            } else {
                System.out.println("Enter correct value from 50 to 250:");
                s = input.next();
            }
        }

        System.out.println("Enter your weight in kg:");
        s = input.next();
        while (true) {
            while (!(s.matches("\\d+[\\.,]?\\d+"))) {
                System.out.println("Enter correct value from 30.0 to 300.0:");
                s = input.next();
            }
            s = s.replace(",", ".");
            double weight = Double.valueOf(s);
            if ((weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT)) {
                this.weight = weight;
                break;
            } else {
                System.out.println("Enter correct value from 30.0 to 300.0:");
                s = input.next();
            }
        }

    }
}