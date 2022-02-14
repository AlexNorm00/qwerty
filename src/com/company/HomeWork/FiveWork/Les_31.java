package com.company.HomeWork.FiveWork;

import java.util.Random;
import java.util.Scanner;

public class Les_31 {
    public static void main(String[] args) {
        //Есть матрица. Посчитать сумму элементов в каждой строке
        int[][] array = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int sumLine=0;
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(0, 20);
                sumLine+=array[i][j];
                if (array[i][j]<10) System.out.print(" "+array[i][j]+" ");
                else System.out.print(""+array[i][j]+" ");
            }
            System.out.println("   Сумма чисел в строке ровна: "+sumLine);
        }
    }
}
