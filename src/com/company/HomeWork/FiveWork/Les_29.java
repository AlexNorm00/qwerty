package com.company.HomeWork.FiveWork;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Random;

public class Les_29 {
    public static void main(String[] args) {
        //Вывести таблицу умножения используя двумерный массив
        int[][] array = new int[11][11];
        for (int i=1;i<=10;i++)
            for (int j=1;j<=10;j++)
                if (i != 0 && j != 0)
                    array[i][j] = i * j;
        for (int i=1;i<=10;i++) {
            for (int j = 1; j <= 10; j++) {
                if (array[i][j] < 10)
                    System.out.print("  "+array[i][j] + "  ");
                else System.out.print("  "+array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
