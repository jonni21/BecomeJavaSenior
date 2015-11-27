package task16;

public class Adviser {

    public String getAdvice(Human client) {

        BmiCalculator bmiCalc = new BmiCalculator();
        double clientsBmi = bmiCalc.calculateBmi(client.getHeight(), client.getWeight());
        String clientsBmiCategory = bmiCalc.getBmiCategory(clientsBmi);

        switch (clientsBmiCategory) {
            case ("Underweight"):
                return "Unfortunately your weight is too low to be healthy.\nYour body mass index (BMI) is: "
                        + clientsBmi + " that value is below that normal for your age and height group.\n" +
                        "There various ways to improve the situation:\n" +
                        "1) Diet. Increase calorie intake;\n" +
                        "2) Exercise. Weight lifting exercises are effective in helping to improve muscle\n" +
                        "tone as well as helping with weight gain.\n" +
                        "3) Appetite stimulants. Certain drugs may increase appetite either as their\n" +
                        "primary effect or as a side effect.";
            case ("Normal"):
                return "Your weight is normal. Your body mass index (BMI) is " + clientsBmi + " which is " +
                        "considered to be a healthy weight.\nNothing to do with it. Keep doing sports, eating " +
                        "healthy food and be happy.";
            case ("Overweight"):
                return "Unfortunately you have more body fat, than is optimally healthy.\n" +
                        "Your body mass index (BMI) is " + clientsBmi + ".\n" +
                        "The usual treatments for overweight individuals is diet and physical exercise.";
            case("Obesity"):
                return "Unfortunately you have too more body fat, than is optimally healthy.\n" +
                        "Obesity is a medical condition in which excess body fat has accumulated\n" +
                        "to the extent that it may have an adverse effect on health.\n" +
                        "It is defined by body mass index (BMI), and your BMI is " + clientsBmi +"\n" +
                        "The usual treatments for overweight individuals is diet and physical exercise.";
            default:
                return "Nothing to advise.";
        }

    }

}