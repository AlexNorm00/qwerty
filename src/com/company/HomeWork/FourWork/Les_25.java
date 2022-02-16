package com.company.HomeWork.FourWork;

import java.util.Random;
import java.util.Scanner;

public class Les_25 {
    public static void main(String[] args) {
        //Есть массив чисел.  Пользователь вводит число. Определить,
        //есть ли это число в массиве. Решить используя while
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int i = 0;
        System.out.print("Введите число для поиска: ");
        int s = scanner.nextInt();
        String text = "";
        while (i < array.length) {
            array[i] = random.nextInt(10);
            text = array[i] == s ? text+"Число на позиции "+i+"\n" : text+"";
            System.out.print(array[i]+" ");
            i++;
        }
        System.out.println("\n"+text);
    }
}
