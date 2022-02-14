package com.company.HomeWork.FiveWork;

import java.util.Scanner;

public class Les_34 {
    public static void main(String[] args) {
        //Нарисовать бабочку
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Бабочка:\nВведите длинну двумерного массива: ");
        int size = scanner.nextInt();
        int[][] buterflayArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buterflayArray[i][j] = j + 1;
                if (j >= buterflayArray[j].length / 2)
                    buterflayArray[i][j] = buterflayArray[j].length - buterflayArray[i][j] + 1;
                if (buterflayArray[i][j] >= i + 2) //ВЫРЕЗАЕТ С 2ЙКИ первую половину
                    buterflayArray[i][j] = -1;
                if (i - 1 >= buterflayArray[i].length / 2) //вырезает вторую половину
                    buterflayArray[i][j] = buterflayArray[buterflayArray[i].length - i - 1][j];
                if (buterflayArray[i][j] != -1) {
                    if (buterflayArray[i][j] < 10)
                        System.out.print(" " + buterflayArray[i][j] + " ");
                    else System.out.print(buterflayArray[i][j] + " ");
                } else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
