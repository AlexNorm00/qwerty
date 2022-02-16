package com.company.HomeWork.FourWork;

import java.util.Random;

public class Les_23 {
    public static void main(String[] args) {
        //Есть массив чисел. Найти среднее арифметическое число элементов массива
        Random random = new Random();
        int[] array = new int[20];
        int arif = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            arif+=array[i];
            System.out.print(array[i] + " ");
        }
        System.out.print("\nСреднее арифметическое: "+arif/array.length);
    }
}
