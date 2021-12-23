package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] arrays;
        int yourNumber;
        int indexDelete;
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("input your size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        arrays = new int[size];
        int i = 0;
        while (i < arrays.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            arrays[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < arrays.length; j++) {
            System.out.print(arrays[j] + "\t");
        }

        System.out.println("Input your number: ");
        yourNumber = scanner.nextInt();
        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] == yourNumber) {
                indexDelete = j;
                for (int k = indexDelete; k < arrays.length - 1; k++) {
                    arrays[k] = arrays[k + 1];
                    System.out.print(arrays[k] + "\t");
                }
                isExit = true;
                break;
            }
        }

        if (!isExit){
            System.out.println("Not found " + yourNumber + " in the list.");
        }

    }
}
