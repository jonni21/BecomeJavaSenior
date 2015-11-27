package task16;

public class Consultant {

    public void start() {

        Human client = new Human();
        Adviser adviser = new Adviser();

        System.out.println("My name is Peter, and I'm your personal Fitness Consultant.");
        System.out.println("I can give you advises about your lifestyle according to your fitness level.");
        System.out.println("To start with, I need to get some information about you.");
        client.setHumanFromConsole();

        System.out.println("OK, " + client.getName() + "!");
        System.out.println("Thank you for the information provided. Let's see what we've got.");
        System.out.println(adviser.getAdvice(client));
    }



}