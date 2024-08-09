package Future_intern;

import java.util.Scanner;

public class Task1_FutureIntern_Calculator {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Basic Calculator!");
	        System.out.println("========================================");
	        
	        System.out.println("Choose an operation for Calculation:");
	        System.out.println("1: Addition (+)");
	        System.out.println("2: Subtraction (-)");
	        System.out.println("3: Multiplication (*)");
	        System.out.println("4: Division (/)");
	        System.out.println("========================================");
	        
	        System.out.println("Choose an operation form the above:");
	        int choice = scanner.nextInt();

	        System.out.println("Enter the first number:");
	        double num1 = scanner.nextDouble();

	        System.out.println("Enter the second number:");
	        double num2 = scanner.nextDouble();

	        double result = 0;
	        boolean valid = true;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                break;
	            case 2:
	                result = num1 - num2;
	                break;
	            case 3:
	                result = num1 * num2;
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    valid = false;
	                }
	                break;
	            default:
	                System.out.println("Invalid choice. Please choose a valid operation.");
	                valid = false;
	        }

	        if (valid) {
	            System.out.println("The result is: " + result);
	        }
	        
	        scanner.close();
	    
	}

}
