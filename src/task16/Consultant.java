package task16;

import java.util.Scanner;

public class Consultant {

    Scanner input = new Scanner(System.in);

    public void start() {

        System.out.println("My name is Peter, and I'm your personal Fitness Consultant.");
        System.out.println("I can give you advises about your lifestyle according to your fitness level.");
        System.out.println("To start with, I need to get some information about you.");
        Human client = new Human();
        client.setHumanFromConsole();

        BmiCalculator bmiCalc = new BmiCalculator();
        double bmiIndex = bmiCalc.calculateBmi(client.getHeight(), client.getWeight());
        String bmiCategory = bmiCalc.getBmiCategory(bmiIndex);
        System.out.println("OK, " + client.getName() + "!");

        System.out.println("Thank you for the information provided. Let's see what we've got. ");
        System.out.println("Your BMI Index is: " + bmiIndex);
        System.out.println("Your BMI Category is: " + bmiCategory);
    }
}