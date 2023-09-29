//----------------Task#2 --------------calculateBMI----------------
public class CalculateBMI {
    public static void main(String[] args) {
        // Input values
        double weightInKilograms = 51.0;
        double heightInMeters = 1.60;

        // Calculate BMI
        double bodyMassIndex = calculateBMI(weightInKilograms, heightInMeters);
// Display the BMI
        System.out.println("The Body Mass Index (BMI) is: " + bodyMassIndex);
    }
   public static double calculateBMI(double weight, double height) {
       // Calculate BMI using the formula: bodyMassIndex = weight / (height * height)
        return weight / (height * height);
    }
}


