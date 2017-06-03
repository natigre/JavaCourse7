package javacourse7.homework.module1;

import java.util.*;

/*
Task 1.2
 */

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number ");
        int size = input.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Initial array:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.println();
        Arrays.sort(array);
        System.out.print("Sorted array:");
        for (int el: array ) {
            System.out.print(" " + el);
        }
    }
}
