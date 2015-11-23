package Task15;

import java.util.ArrayList;

public class Computer {

    private String cpuModel;
    private double cpuClockSpeedInGhz;
    private String ramType;
    private int ramQuantityInGb;
    private String motherboardManufacturer;
    private String motherboardModel;
    private String hddType;
    private String hddManufacturer;
    private int hddCapacityInGb;
    private String videocardModel;
    private int videocardRamQuantityInGb;

    private boolean isTurnedOn;
    private boolean isOSInstalled;
    private boolean isBooted;
    private ArrayList<String> programsInstalled;


    public Computer() {
        isTurnedOn = false;
        isOSInstalled = false;
        isBooted = false;
        programsInstalled = new ArrayList<>();
    }

    public Computer(String cpuModel, double cpuClockSpeedInGhz, String ramType, int ramQuantityInGb,
                    String motherboardManufacturer, String motherboardModel, String hddType,
                    String hddManufacturer, int hddCapacityInGb, String videocardModel,
                    int videocardRamQuantityInGb) {

        this.cpuModel = cpuModel;
        this.cpuClockSpeedInGhz = cpuClockSpeedInGhz;
        this.ramType = ramType;
        this.ramQuantityInGb = ramQuantityInGb;
        this.motherboardManufacturer = motherboardManufacturer;
        this.motherboardModel = motherboardModel;
        this.hddType = hddType;
        this.hddManufacturer = hddManufacturer;
        this.hddCapacityInGb = hddCapacityInGb;
        this.videocardModel = videocardModel;
        this.videocardRamQuantityInGb = videocardRamQuantityInGb;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setCpuClockSpeedInGhz(double cpuClockSpeedInGhz) {
        this.cpuClockSpeedInGhz = cpuClockSpeedInGhz;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public void setRamQuantityInGb(int ramQuantityInGb) {
        this.ramQuantityInGb = ramQuantityInGb;
    }

    public void setMotherboardManufacturer(String motherboardManufacturer) {
        this.motherboardManufacturer = motherboardManufacturer;
    }

    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }

    public void setHddType(String hddType) {
        this.hddType = hddType;
    }

    public void setHddManufacturer(String hddManufacturer) {
        this.hddManufacturer = hddManufacturer;
    }

    public void setHddCapacityInGb(int hddCapacityInGb) {
        this.hddCapacityInGb = hddCapacityInGb;
    }

    public void setVideocardModel(String videocardModel) {
        this.videocardModel = videocardModel;
    }

    public void setVideocardRamQuantityInGb(int videocardRamQuantityInGb) {
        this.videocardRamQuantityInGb = videocardRamQuantityInGb;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public double getCpuClockSpeedInGhz() {
        return cpuClockSpeedInGhz;
    }

    public String getRamType() {
        return ramType;
    }

    public int getRamQuantityInGb() {
        return ramQuantityInGb;
    }

    public String getMotherboardManufacturer() {
        return motherboardManufacturer;
    }

    public String getMotherboardModel() {
        return motherboardModel;
    }

    public String getHddType() {
        return hddType;
    }

    public String getHddManufacturer() {
        return hddManufacturer;
    }

    public int getHddCapacityInGb() {
        return hddCapacityInGb;
    }

    public String getVideocardModel() {
        return videocardModel;
    }

    public int getVideocardRamQuantityInGb() {
        return videocardRamQuantityInGb;
    }

    public void programInstall(String progName) {
        if (isBooted) {
            if (programsInstalled.contains(progName)) {
                System.out.println("This program is already installed!");
            } else {
                programsInstalled.add(progName);
            }
        }
    }

    public void programUninstall(String progName) {
        if (isBooted) {
            if (programsInstalled.contains(progName)) {
                programsInstalled.remove(progName);
            } else {
                System.out.println("This program isn't installed. Nothing to uninstall!");
            }
        }
    }

    public void listProgramsInstalled() {
        if (isBooted) {
            System.out.println(programsInstalled);
        }
    }

    public void turnOn() {
        isTurnedOn = true;
        System.out.println("The computer is turned on.");
    }

    public void turnOff() {
        isBooted = false;
        isTurnedOn = false;
        System.out.println("The computer is turned off.");
    }

    public void OSInstall() {
        isOSInstalled = true;
        System.out.println("Operating System was successfully installed.");
    }

    public void OSUninstall() {
        isOSInstalled = false;
        isBooted = false;
        System.out.println("Operating System was successfully uninstalled.");
    }

    public void boot() {
        if (isTurnedOn) {
            if (isOSInstalled) {
                isBooted = true;
                System.out.println("Operating System was successfully loaded!");
            } else {
                System.out.println("Can't boot! Operating system missing!");
            }
        } else {
            System.out.println("Can't boot! The computer is turned off!");
        }
    }

    @Override
    public String toString() {

        return "Процессор: " + cpuModel + " " + cpuClockSpeedInGhz + "GHz\n" +
                "Оперативная память: " + ramType + " " + ramQuantityInGb + "GB\n" +
                "Материнская плата: " + motherboardManufacturer + " " + motherboardModel + "\n" +
                "Жесткий диск: " + hddType + " " + hddManufacturer + " " + hddCapacityInGb + "GB\n" +
                "Видеокарта: " + videocardModel + " " + videocardRamQuantityInGb + "GB";

    }


}