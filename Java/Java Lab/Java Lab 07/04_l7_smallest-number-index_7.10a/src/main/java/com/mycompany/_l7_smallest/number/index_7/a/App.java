package com.mycompany._l7_smallest.number.index_7.a;
import java.util.Scanner;
public class App {
    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1) return 0;
        double min = array[0];
        int minimumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();
        System.out.println("The minimum number is " +
                numbers[indexOfSmallestElement(numbers)] + " index " +
			indexOfSmallestElement(numbers));
    }
}
