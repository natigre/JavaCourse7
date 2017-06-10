package javacourse7.homework.module1.homework;

import java.util.Scanner;

public class ConsoleHelper {

    Scanner scanner = new Scanner(System.in);

    public void start() {

        System.out.println("Hello! Please enter the size of the array!");
        int size;
        size = scanner.nextInt();

        ArrayHolder imass = new ArrayHolder(size);
        imass.fillArray(size);

        while (true) {
            System.out.println("Make your choice: ");
            System.out.println("   1. Sort an array in ascending order;");
            System.out.println("   2. Sort an array in descending order;");
            System.out.println("   3. Search number of array;");
            System.out.println("   4. Exit program. ");

            int choice = 0;
            while (choice == 0) {
                try {
                    choice = Integer.parseInt(scanner.next());
                } catch (Exception e) {
                    System.out.println("Wrong! Try again!");
                    System.out.println();
                }
            }

            switch (choice) {
                case 1:
                    imass.sortArrayInAscendingOrder();
                    break;
                case 2:
                    imass.sortArrayInDescendingOrder();
                    break;
                case 3:
                    imass.searchElementOfArray();
                    break;
                case 4:
                    imass.exitFromProgram();
                    break;
                default:
                    System.out.println("Wrong! Try again!");
            }

        }

    }
}
