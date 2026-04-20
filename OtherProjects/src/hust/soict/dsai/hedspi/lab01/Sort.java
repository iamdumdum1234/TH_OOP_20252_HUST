package hust.soict.dsai.hedspi.lab01;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        System.out.print("How many numbers?\n");
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int[] numbers = new int[nums];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        int sum = 0;
        System.out.print("Sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println("\nSum: " + sum);
        System.out.print("Average: " + sum / nums);
    }
}
