package com.company.HomeWork.FiveWork;

import java.util.Random;
import java.util.Scanner;

public class Les_30 {
    public static void main(String[] args) {
        //Есть матрица. Найти в ней введенное пользователем число и вывести номер столбца и строки
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][10];
        Random random = new Random();
        String text = "Индексы похожих чисел: ";
        System.out.print("Введите число для поиска: ");
        int poisk = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(0, 20);
                if (array[i][j] == poisk) text += "(" + i + "," + j + "),";
                if (array[i][j] < 10) System.out.print(" "+array[i][j] + " ");
                else System.out.print(""+array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(text);
    }
}
