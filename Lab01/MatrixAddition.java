import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        int[][] sum = new int[rows][columns];
        System.out.println("Please enter the elements of the matrix, from left to right, top to bottom:");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Now, please enter the elements of the SECOND matrix, from left to right, top to bottom:");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                b[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum of the 2 matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}