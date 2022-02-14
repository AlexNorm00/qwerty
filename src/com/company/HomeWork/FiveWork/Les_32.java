package com.company.HomeWork.FiveWork;

import java.util.Random;

public class Les_32 {
    public static void main(String[] args) {
        //Есть матрица. Посчитать сумму элементов в каждой строке
        int[][] array = {{1,2,3,4},{4,3,2,1},{7,8,9,6},{6,5,4,3}};
        int sumMidleLine = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j)sumMidleLine+=array[i][j];
                System.out.print(" "+array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Сумма чисел на главной диагонали: "+sumMidleLine);
    }
}
