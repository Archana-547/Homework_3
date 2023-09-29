//--------------Task#7----------Encryption of Symbol--------------
public class EncryptionOfSymbols {


        public static void main(String[] args) {
            // Create a variable of type char and assign it a character
            char originalChar = 'A';

            // Define the number of positions to shift
            int shiftAmount = 2;

            // Encrypt the character by shifting it
            char encryptedChar = (char) (originalChar + shiftAmount);

            // Display the original and modified characters
            System.out.println("Original character: " + originalChar);
            System.out.println("Encrypted character: " + encryptedChar);
        }
    }

