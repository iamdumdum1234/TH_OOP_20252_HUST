import java.util.Scanner;

public class Triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Enter a number: ");
        choice = sc.nextInt();
        for (int i = 0; i < choice; i++) {
            for (int j = 0; j < 2 * (choice - i - 1); j++)
                System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
