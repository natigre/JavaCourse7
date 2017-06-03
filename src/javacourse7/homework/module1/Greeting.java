package javacourse7.homework.module1;

import java.util.*;

public class Greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }
}
