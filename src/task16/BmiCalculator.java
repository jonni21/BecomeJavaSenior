package task16;

public class BmiCalculator {

    public double calculateBmi(double height, double weight) {
        return (weight / (height * height / 10000));
    }

    public String getBmiCategory(double bmiIndex) {

        final double UNDERWEIGHT_BORDER_VALUE = 18.5;
        final double NORMAL_BORDER_VALUE = 25.0;
        final double OVERWEIGHT_BORDER_VALUE = 30.0;

        if (bmiIndex < UNDERWEIGHT_BORDER_VALUE) {
            return "Underweight";
        } else if ((bmiIndex >= UNDERWEIGHT_BORDER_VALUE) && (bmiIndex < NORMAL_BORDER_VALUE)) {
            return "Normal";
        } else if ((bmiIndex >= NORMAL_BORDER_VALUE) && (bmiIndex < OVERWEIGHT_BORDER_VALUE)) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
