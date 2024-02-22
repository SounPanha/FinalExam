package main.practical;

import java.util.Scanner;

public class Exercise {

    public void launch() {

        viewNumber();

    }

    public void viewNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("Enter the list of numbers you want to input: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Display your numbers:");
        for (int number : numbers) {
            System.out.print(", " + number);
        }
        scanner.close();
    }


}
