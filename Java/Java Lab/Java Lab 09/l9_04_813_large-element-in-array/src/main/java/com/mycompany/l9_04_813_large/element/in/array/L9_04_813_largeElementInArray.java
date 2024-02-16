package com.mycompany.l9_04_813_large.element.in.array;

import java.util.Scanner;

public class L9_04_813_largeElementInArray {
    public static int[] locateLargest(double[][] a) {
        int[] l = new int[2];
        double max = 0;
        l[0] = 0;
        l[1] = 0;
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[i].length; j++) if (a[i][j] > max) {
            l[0] = i;
            l[1] = j;
            max = a[i][j];
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] array = new double[row][column];
        System.out.println("Enter the array:");
        for (int i = 0; i < array.length; i++) for (int j = 0; j < array[i].length; j++) array[i][j] = input.nextDouble();
        int[] location = locateLargest(array);
        System.out.println("The location of the largest element is at (" +location[0]+ ", " + location[1]+ ")");
    }
}
