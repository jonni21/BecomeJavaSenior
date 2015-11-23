package Task15;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        Computer myComp = new Computer("AMD FX-6300", 3, "DDR3-12800", 8, "ASRock", "960GM/U3S3 FX", "SSD", "Intel",
                120, "ATI Radeon R9 170x", 2);
        myComp.turnOn();
        myComp.OSInstall();
        myComp.boot();
        myComp.programInstall("Calculator");
        myComp.programInstall("FileManager");
        myComp.programInstall("Notepad++");
        myComp.programInstall("MS Office");
        myComp.listProgramsInstalled();
        myComp.programInstall("WorldOfTanks");
        myComp.programInstall("Skype");
        myComp.listProgramsInstalled();
        myComp.programUninstall("MS Office");
        myComp.listProgramsInstalled();
        myComp.programUninstall("Git");
        myComp.OSUninstall();
        myComp.boot();
        myComp.OSInstall();
        myComp.listProgramsInstalled();

        Calculator myCalc = new Calculator();
        myCalc.getSum(23.4, 45.6);
        myCalc.printResult();
        int[] arrayOfIntegers = {10, 53, 45, -99, 999, 999, -56, 10265, 1266, 10265};
        myCalc.getMax(arrayOfIntegers);
        myCalc.printResult();
        myCalc.getSqrt(64);
        myCalc.getSin(180);
        myCalc.printResultArray();

        FileManager myFileManager = new FileManager();
        myFileManager.copyBuffered("F:\\first.txt", "F:\\second.txt");

    }

}
