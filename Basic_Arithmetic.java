import java.util.Scanner;

class ScannerProgram {
    public static void main(String args[]) {
        int a, b, add, sub, mul, div;
        int ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number = ");
        a = sc.nextInt(); 

        System.out.println("Enter second number = ");
        b = sc.nextInt();

        System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division \n");

        System.out.println("Enter your choice = ");
        ch = sc.nextInt();

        switch(ch) {
            case 1: 
                add = a + b; 
                System.out.println("\nAddition is " + add); 
                break;
            case 2: 
                sub = a - b; 
                System.out.println("\nSubtraction is " + sub); 
                break;
            case 3: 
                mul = a * b; 
                System.out.println("\nMultiplication is " + mul); 
                break;
            case 4: 
                if (b != 0) {
                    div = a / b;
                    System.out.println("\nDivision is " + div); 
                } else {
                    System.out.println("\nDivision by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice!! ");
        }
    }
}
