import java.util.Scanner;

public class first {
    
    // Method to check if a number is Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;
        
        // Calculate sum of digits raised to power of number of digits
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        
        // Check if sum equals original number
        return sum == originalNumber;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        // Display some examples
        System.out.println("\nExamples of Armstrong numbers:");
        System.out.println("153 is Armstrong: " + isArmstrong(153) + " (1³ + 5³ + 3³ = 1 + 125 + 27 = 153)");
        System.out.println("9474 is Armstrong: " + isArmstrong(9474) + " (9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474)");
        System.out.println("371 is Armstrong: " + isArmstrong(371) + " (3³ + 7³ + 1³ = 27 + 343 + 1 = 371)");
        
        scanner.close();
    }
}
