package com.company.HomeWork.FiveWork;

import java.util.Random;
import java.util.Scanner;

public class Les_33 {
    public static void main(String[] args) {
        //Создать Jagged Array (т.е число элементов в каждом
        // под массиве двумерного массива может отличаться) с помощью
        // пользователя и сканера. Пример такого массива:
        // int[][] myArray = {{1,2,3},{56},{1,2,6,1,3,1,3},{2,2}};
        Scanner scanner = new Scanner(System.in);
        Random random =new Random();
        System.out.print("Введите число строк массива :");
        int size1 = scanner.nextInt();
        int[][] array = new int[size1][];
        for (int i = 0; i < size1; i++) {
            System.out.println("\nВведите длинну " + i + "-о массива");
            array[i] = new int[scanner.nextInt()];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        System.out.println("Массив чисел:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
