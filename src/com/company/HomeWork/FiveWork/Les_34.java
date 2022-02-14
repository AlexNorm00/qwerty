package com.company.HomeWork.FiveWork;

import java.util.Scanner;

public class Les_34 {
    public static void main(String[] args) {
        //Нарисовать бабочку
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Бабочка:\nВведите длинну двумерного массива: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = j + 1;
                if (j >= array[j].length / 2)
                    array[i][j] = array[j].length - array[i][j] + 1;
                if (array[i][j] >= i + 2)
                    array[i][j] = -1;
                if (i - 1 >= array[i].length / 2)
                    array[i][j] = array[array[i].length - i - 1][j];
                if (array[i][j] != -1) {
                    if (array[i][j] < 10)
                        System.out.print(" " + array[i][j] + " ");
                    else System.out.print(array[i][j] + " ");
                } else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
