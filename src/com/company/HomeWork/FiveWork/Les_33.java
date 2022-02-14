package com.company.HomeWork.FiveWork;

import java.util.Scanner;

public class Les_33 {
    public static void main(String[] args) {
        //Создать Jagged Array (т.е число элементов в каждом
        // под массиве двумерного массива может отличаться) с помощью
        // пользователя и сканера. Пример такого массива:
        // int[][] myArray = {{1,2,3},{56},{1,2,6,1,3,1,3},{2,2}};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число строк массива :");
        int size1 = scanner.nextInt();
        System.out.print("x");
        int size2 = scanner.nextInt();
        int[][] array = new int[size1][size2];
        System.out.println("\nЗаполнение массива");
        for (int i = 0; i < size1; i++)
            for (int j = 0; j < size2; j++) {
                System.out.print("Элемент на позиции (" + i + "," + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        System.out.println("Массив чисел:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
