package task16;

import java.util.Scanner;

public class Consultant {

    public void start() {

        Human client = new Human();
        Adviser adviser = new Adviser();
        Scanner input = new Scanner(System.in);

        System.out.println("My name is Peter, and I'm your personal Fitness Consultant.");
        System.out.println("I can give you advises about your lifestyle according to your fitness level.");
        System.out.println("To start with, I need to get some information about you.");

        System.out.println("Enter your name:");
        String name = input.next();
        while (!client.setName(name)) {
            System.out.println("Please, enter correct value (3 to 15 english letters).");
            name = input.next();
        }

        System.out.println("Enter your sex (male/female):");
        String sex = input.next();
        while (!client.setSex(sex)) {
            System.out.println("Enter correct value (\"male\" or \"female\"):");
            sex = input.next();
        }

        System.out.println("Enter your age:");
        String age = input.next();
        while (true) {
            while (!age.matches("\\d+")) {
                System.out.println("Enter correct value from " + client.MIN_AGE + " to " + client.MAX_AGE + ":");
                age = input.next();
            }
            while (!client.setAge(Integer.valueOf(age))) {
                System.out.println("Enter correct value from " + client.MIN_AGE + " to " + client.MAX_AGE + ":");
                age = input.next();
            }
            break;
        }

        System.out.println("Enter your weight in kg:");
        String weight = input.next();
        while (true) {
            while (!weight.matches("\\d+[\\.,]?\\d+")) {
                System.out.println("Enter correct value from " + client.MIN_WEIGHT + " to " + client.MAX_WEIGHT + ":");
                weight = input.next();
            }
            while (!client.setWeight(Double.valueOf(weight))) {
                System.out.println("Enter correct value from " + client.MIN_WEIGHT + " to " + client.MAX_WEIGHT + ":");
                weight = input.next();
            }
            break;
        }

        System.out.println("Enter your height in cm:");
        String height = input.next();
        while (true) {
            while (!height.matches("\\d+[\\.,]?\\d+")) {
                System.out.println("Enter correct value from " + client.MIN_HEIGHT + " to " + client.MAX_HEIGHT + ":");
                height = input.next();
            }
            while (!client.setHeight(Double.valueOf(height))) {
                System.out.println("Enter correct value from " + client.MIN_HEIGHT + " to " + client.MAX_HEIGHT + ":");
                height = input.next();
            }
            break;
        }

        System.out.println("OK, " + client.getName() + "!");
        System.out.println("Thank you for the information provided. Let's see what we've got.");
        System.out.println(adviser.getAdvice(client));
    }
}