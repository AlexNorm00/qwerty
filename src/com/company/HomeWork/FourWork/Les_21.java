package com.company.HomeWork.FourWork;

import java.util.Scanner;

public class Les_21 {
    public static void main(String[] args) {
        //Создать массив из 3 элементов. Вывести сумму.
        int[] array = {10, 13, 24};
        int sum=0;
        for (int i = 0; i<array.length;i++) {
            System.out.print(array[i] + " ");
            sum+=array[i];
        }
        System.out.println("Сумма = "+sum);
    }
}
