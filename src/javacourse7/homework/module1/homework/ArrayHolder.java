package javacourse7.homework.module1.homework;

import java.util.*;

public class ArrayHolder {
    private int[] array;
    private int size;
    private int numberToSearch;
    private Scanner scanner = new Scanner(System.in);

    public ArrayHolder() {
    }

    public ArrayHolder(int size) {
        this.size = size;
        this.array = new int[size];
    }
    public void addSize() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
    }

    public void fillArray(int size) {
        int count = 0;
        while (count < size) {
            System.out.print("Enter number " + (count + 1) + ": ");
            try {
                array[count] = Integer.parseInt(scanner.next());
                count++;
            } catch (Exception e) {
                System.out.println("This is not number. Please try again.");
            }
        }
        System.out.println();
        System.out.println("Initial array:" + Arrays.toString(array));
    }

    public void sortArrayInAscendingOrder() {
        Arrays.sort(array);
        System.out.println("Sorted array:" + Arrays.toString(array));
    }

    public void sortArrayInDescendingOrder() {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        System.out.println("Sorted array in descending order:" + Arrays.toString(array));
    }

    public void searchElementOfArray() {
        System.out.println("What number do you want to search?");
        boolean isInteger = false;
        while (!isInteger) {
            try {
                numberToSearch = Integer.parseInt(scanner.next());
                isInteger = true;
            } catch (Exception e) {
                System.out.println("Not Integer, try again!");
            }
        }

        System.out.println("Searching..");
        System.out.println("Searching....");

        int chekPossition = 0;
        for (int i = 0; i < size; i++) {
            if (numberToSearch == array[i]) {
                System.out.println("Number " + numberToSearch + " is found, array index is: " + i);
                chekPossition = 3;
                break;
            } else chekPossition = -1;
        }
        if (chekPossition == -1) System.out.println("Number is not found.");
    }

    public void exitFromProgram() {
        System.out.println("Good bye!\nThanks! And have a nice day!");
        System.exit(0);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayHolder" +
                "array= " + Arrays.toString(array);
    }
}
