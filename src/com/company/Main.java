package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("Enter size arr:");
            Scanner scanner = new Scanner(System.in);
            int sizearr = scanner.nextInt();
            int[] arr = new int[sizearr];
            System.out.println("Array is:");
            for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * 9);
                    System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();
            System.out.println("Enter the position in the array: ");
            int index = scanner.nextInt();
            addNumber(arr, index, number);
    }

    public static void addNumber(int[] arr, int index, int number) {
            if (index >= 0 && index <= arr.length) {
                    int[] arrnew = new int[arr.length + 1];
                    for (int i = 0; i < arr.length; i++) {
                            arrnew[i] = arr[i];
                            if (i == index) {
                                    arrnew[i] = number;
                                    break;
                            }
                    }
                    for (int i = index; i < arr.length; i++) {
                            arrnew[i + 1] = arr[i];
                    }
                    System.out.print("New array:");
                    for (int i = 0; i < arrnew.length; i++) {
                            System.out.print(arrnew[i] + " ");
                    }
            } else {
                    System.out.println("Cannot add element into array!");
            }
    }
}