package hust.soict.dsai.hedspi.lab01;

import java.util.Scanner;

public class HowManyDays {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        while (true) {
            System.out.print("What year?\n");
            year = input.nextInt(); // Assign value inside

            if (year < 0) {
                System.out.println("Invalid year! Try again.\n");
                continue;
            } else {
                break; // Exit loop when input is valid
            }
        }
        int isLeapYear = year % 4;
        if (year % 100 == 0 && year % 400 != 0) {
            isLeapYear = 1;
        }
        while (true) {
            System.out.print("What month?\n");
            String month = input.next();
            switch (month.toLowerCase()) {
                case "1":
                case "jan.":
                case "jan":
                case "january": {
                    System.out.println("January has 31 days in the year " + year + ".");
                    return;
                }
                case "2":
                case "feb.":
                case "feb":
                case "february": {
                    if (isLeapYear != 0) {
                        System.out.println("February has 28 days in the year " + year + ".");
                    } else {
                        System.out.println("February has 29 days in the year " + year + ".");
                    }
                    return;
                }
                case "3":
                case "mar.":
                case "mar":
                case "march": {
                    System.out.println("March has 31 days in the year " + year + ".");
                    return;
                }
                case "4":
                case "apr.":
                case "apr":
                case "april": {
                    System.out.println("April has 30 days in the year " + year + ".");
                    return;
                }
                case "5":
                case "may": {
                    System.out.println("May has 31 days in the year " + year + ".");
                    return;
                }
                case "6":
                case "jun":
                case "june": {
                    System.out.println("June has 30 days in the year " + year + ".");
                    return;
                }
                case "7":
                case "jul":
                case "july": {
                    System.out.println("July has 31 days in the year " + year + ".");
                    return;
                }
                case "8":
                case "aug.":
                case "aug":
                case "august": {
                    System.out.println("August has 31 days in the year " + year + ".");
                    return;
                }
                case "9":
                case "sept.":
                case "sep":
                case "september": {
                    System.out.println("September has 30 days in the year " + year + ".");
                    return;
                }
                case "10":
                case "oct.":
                case "oct":
                case "october": {
                    System.out.println("October has 31 days in the year " + year + ".");
                    return;
                }
                case "11":
                case "nov.":
                case "nov":
                case "november": {
                    System.out.println("November has 30 days in the year " + year + ".");
                    return;
                }
                case "12":
                case "dec.":
                case "dec":
                case "december": {
                    System.out.println("December has 31 days in the year " + year + ".");
                    return;
                }
                default: {
                    System.out.println("Invalid input. Try again.\n");
                }
            }
        }
    }
}
