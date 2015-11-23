package Task15;

import java.util.Scanner;

public class Calculator {

    private double result;
    private String[][] resultArray = new String[11][3];
    private int sumIndex;
    private int sinIndex;
    private int sqrtIndex;

    public Calculator() {
        resultArray[0][0] = "sum";
        resultArray[0][1] = "sin";
        resultArray[0][2] = "sqrt";
        sumIndex = 1;
        sinIndex = 1;
        sqrtIndex = 1;
    }

    public void getSum(double firstOperand, double secondOperand) {
        result = firstOperand + secondOperand;
        saveResultInArray("sum", result);
    }

    public void getSin(double angleInRadians) {
        result = Math.sin(angleInRadians);
        saveResultInArray("sin", result);
    }

    public void getSqrt(double operand) {
        result = Math.sqrt(operand);
        saveResultInArray("sqrt", result);
    }

    public void getMax(int[] inputArray) {
        int max = inputArray[0];
        for (int i : inputArray) {
            if (max < i)
                max = i;
        }
        result = max;
    }

    private void saveResultInArray(String typeOfCalculation, double result) {
        switch (typeOfCalculation) {
            case "sum":
                resultArray[sumIndex][0] = String.valueOf(result);
                ++sumIndex;
                if (sumIndex == 11) sumIndex = 1;
                break;
            case "sin":
                resultArray[sinIndex][1] = String.valueOf(result);
                ++sinIndex;
                if (sinIndex == 11) sinIndex = 1;
                break;
            case "sqrt":
                resultArray[sqrtIndex][2] = String.valueOf(result);
                ++sqrtIndex;
                if (sqrtIndex == 11) sqrtIndex = 1;
                break;
        }
    }

    public void printResult() {
        System.out.println(result);
    }

    public void printResultArray() {
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void makeCalculation() {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        Double firstOperand = new Double(s.replace(',', '.'));
        String operator = input.next();
        s = input.next();
        Double secondOperand = new Double(s.replace(',', '.'));
        switch (operator) {
            case "+":
                getSum(firstOperand, secondOperand);
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
        }
        printResult();
    }

}
