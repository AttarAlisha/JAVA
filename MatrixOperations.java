import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] result = new int[rows][columns];

        // for the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        //for the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix operations:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Scalar Multiplication\n5. Transpose of Both Matrices");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                // Perform matrix addition
			System.out.println("Addition:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                break;

            case 2:
                // Perform matrix subtraction
		
                System.out.println("Subtraction:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        result[i][j] = matrix1[i][j] - matrix2[i][j];
                    }
                }
		break;

            case 3:
                // Perform matrix multiplication
                if (columns != rows) {
                    System.out.println("Matrix multiplication not possible.");
                    return;
                }
                int[][] multi = new int[rows][columns];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        for (int k = 0; k < columns; k++) {
                            multi[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                
                result = multi;
                break;

            case 4:
                // Perform scalar multiplication
                System.out.print("Enter the scalar value: ");
                int scalar = sc.nextInt();
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        result[i][j] = matrix1[i][j] * scalar;
                    }
                }
                System.out.println("Scalar multiplication:");
                break;

            case 5:
                // Perform transpose of both matrices
                // Transpose matrix1
                int[][] transpose1 = new int[columns][rows];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        transpose1[j][i] = matrix1[i][j];
                    }
                }
                System.out.println("Transpose of the first matrix:");
                for (int i = 0; i < columns; i++) {
                    for (int j = 0; j < rows; j++) {
                        System.out.print(transpose1[i][j] + " ");
                    }
                    System.out.println();
                }

                // Transpose matrix2
                int[][] transpose2 = new int[columns][rows];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        transpose2[j][i] = matrix2[i][j];
                    }
                }
                System.out.println("Transpose of the second matrix:");
                for (int i = 0; i < columns; i++) {
                    for (int j = 0; j < rows; j++) {
                        System.out.print(transpose2[i][j] + " ");
                    }
                    System.out.println();
                }
                return;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Display the result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

      
    }
}
