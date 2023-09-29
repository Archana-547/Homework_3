//---------------------Task#8---------DataProcessing---------------
import java.util.Scanner;

public class DataProcessing {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Enter 2 numbers from the keyboard and save into integer variables
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            // Multiply the numbers together
            int result = firstNumber * secondNumber;

            // Output the result to the console
            System.out.println("The result of multiplying " + firstNumber + " and " + secondNumber + " is: " + result);
        }
    }

