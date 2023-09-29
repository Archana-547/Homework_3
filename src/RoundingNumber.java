//--------------Task#5-----------Rounding a Number
public class RoundingNumber {

        public static void main(String[] args) {
            // Create a variable of type double and assign a fractional value to it
            double fractionalValue = 5.75;

            // Create a new variable of type int and explicitly convert the double value to int
            int roundedValue = (int) Math.round(fractionalValue);

            // Print the original fractional value and the rounded integer value
            System.out.println("Original fractional value: " + fractionalValue);
            System.out.println("Rounded integer value: " + roundedValue);
        }
    }

