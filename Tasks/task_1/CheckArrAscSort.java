package task_1;

import java.util.Scanner;

public class CheckArrAscSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        while (true) {
            System.out.println();
            System.out.println("Enter the size of the array (positive integer): ");
            try {
                size = Integer.parseInt(sc.nextLine());
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Size must be a positive integer. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        int[] nums = new int[size];

        while (true) {
            System.out.println();
            System.out.println("Enter the values of the array seperated by spaces:");
            String[] input = sc.nextLine().split(" ");
            if (input.length != size) {
                System.out.println("Please enter exactly " + size + " integers.");
                continue;
            }

            try {
                for (int i = 0; i < size; i++) {
                    nums[i] = Integer.parseInt(input[i]);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers only.");
                System.out.println();
            }
        }

        boolean isSorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println();
        System.out.println(isSorted ? "True" : "False");
    }
}