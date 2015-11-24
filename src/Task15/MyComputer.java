package Task15;

import java.io.IOException;
import java.util.Scanner;

public class MyComputer {

    public void start() throws IOException {

        Computer pentium2 = new Computer();
        boolean run = true;

        System.out.println("Hello, my dear friend! I'm your new Pentium II computer. ");
        System.out.println("Choose your destiny:");
        System.out.println("1) Turn on the computer;");
        System.out.println("2) Install OS;");
        System.out.println("3) Boot;");
        System.out.println("4) Install the program;");
        System.out.println("5) List programs installed;");
        System.out.println("6) Run the program;");
        System.out.println("7) Turn off the computer;");

        while (run) {
            Scanner input = new Scanner(System.in);

            String choice = input.next();
            if (choiceCheck(choice, 1, 7)) {
                switch (choice) {
                    case ("1"):
                        pentium2.turnOn();
                        break;
                    case ("2"):
                        pentium2.OSInstall();
                        break;
                    case ("3"):
                        pentium2.boot();
                        break;
                    case ("4"):
                        if (pentium2.getIsBooted()) {
                            System.out.println("Enter the name of the program to be installed:");
                            String progName = input.next();
                            pentium2.programInstall(progName);
                            break;
                        } else {
                            System.out.println("OS isn't loaded! Can't install the program!");
                            break;
                        }
                    case ("5"):
                        pentium2.listProgramsInstalled();
                        break;
                    case ("6"):
                        if (pentium2.getIsBooted()) {
                            System.out.println("Choose the program to run:");
                            System.out.println("1) FileManager;");
                            System.out.println("2) Calculator;");
                            String menuNumber = input.next();
                            if (choiceCheck(menuNumber, 1, 2)) {
                                switch (menuNumber) {
                                    case ("1"):
                                        System.out.println("This program can copy text from one file to another.");
                                        System.out.println("Please enter the name of the source file:");
                                        String source = input.next();
                                        System.out.println("Please enter the name of the destination file:");
                                        String destination = input.next();
                                        try {
                                            FileManager myFileManager = new FileManager();
                                            myFileManager.copyBuffered(source, destination);
                                            System.out.println("Text from " + source + " has been successfully" +
                                                    " copied to " + destination);
                                        } catch (IOException ex) {
                                            System.err.println(ex.getMessage());
                                        }
                                        break;
                                    case ("2"):
                                        System.out.println("You can use this program to make calculations.");
                                        Calculator myCalc = new Calculator();
                                        myCalc.makeCalculation();
                                        break;
                                }
                            } else {
                                System.out.println("Use numbers 1 or 2");
                            }
                            break;
                        } else {
                            System.out.println("OS isn't loaded! Can't use this menu!");
                            break;
                        }
                    case ("7"):
                        pentium2.turnOff();
                        run = false;
                        break;
                }
            } else {
                System.out.println("Use numbers from 1 to 7");
            }
        }
    }

    private boolean choiceCheck(String choice, int min, int max) {
        if ((choice.matches("\\d")) && (Integer.valueOf(choice) >= min) && (Integer.valueOf(choice) <= max)) {
            return true;
        } else {
            return false;
        }
    }
}