/*
Project: Java Array Search – Input Handling & Algorithm Fundamentals
Author: Tyfanna Moulton

Description:
------------
This program demonstrates basic algorithmic problem-solving using Java.
It accepts a fixed set of user-provided integers, then checks whether a
target value exists within the dataset.

The project emphasizes:
- Secure and structured input handling
- Array traversal
- Conditional logic and boolean state tracking

This type of logic is foundational for security tooling, log analysis,
and data validation workflows.

Scope:
------
Developed for educational purposes to demonstrate programming fundamentals
and algorithmic reasoning.
*/

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        System.out.print("\nEnter the target number: ");
        int target = scan.nextInt();

        boolean found = false;

        for (int value : numbers) {
            if (value == target) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("The target number was found in the dataset.");
        } else {
            System.out.println("The target number was not found in the dataset.");
        }

        scan.close();
    }
}
