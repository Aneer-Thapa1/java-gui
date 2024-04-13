import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number (x): ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the second number (y): ");
        int y = scanner.nextInt();
        
        int sum = x + y;
        int subtraction = x - y;
        int multiplication = x * y;
        int division = x / y;
        
        System.out.println("Addition (x + y): " + sum);
        System.out.println("Subtraction (x - y): " + subtraction);
        System.out.println("Multiplication (x * y): " + multiplication);
        System.out.println("Division (x / y): " + division);
        
        scanner.close();
    }
}
