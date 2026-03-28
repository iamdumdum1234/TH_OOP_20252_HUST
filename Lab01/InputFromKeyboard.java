import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What's your name?\n");
        String strName = keyboard.nextLine();
        System.out.print("How old are you?\n");
        int iAge = keyboard.nextInt();
        System.out.print("How tall are you (m)?\n");
        double dHeight = keyboard.nextDouble();

        // similar to other data types
        // nextByte(), nextShort(), nextLong()
        // nextFloat(), nextBoolean()

        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. Your height is " + dHeight + ".");
    }
}
