package com.company.HomeWork.FourWork;

import java.util.Random;
import java.util.Scanner;

public class Les_22 {
    public static void main(String[] args) {
        //При помощи класса сканер и пользователя заполнить массив.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Элемент массива №"+i+": ");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
