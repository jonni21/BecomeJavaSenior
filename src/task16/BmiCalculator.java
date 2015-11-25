package task16;

public class BmiCalculator {

    public double calculateBmi(double height, double weight) {
        return (weight / (height * height / 10000));
    }

    public String getBmiCategory(double bmiIndex) {
        if (bmiIndex < 18.5) {
            return "Underweight";
        } else if ((bmiIndex >= 18.5) && (bmiIndex < 25.0)) {
            return "Normal";
        } else if ((bmiIndex >= 25.0) && (bmiIndex < 30.0)) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
