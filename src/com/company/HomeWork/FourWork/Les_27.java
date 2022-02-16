package com.company.HomeWork.FourWork;

import java.util.Random;

public class Les_27 {
    public static void main(String[] args) {
        //Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
        Random random = new Random();
        int[] array = new int[20];
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            if (array[i] % 2 == 0) size++;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] array2 = new int[size+1];
        for (int i = 0, j = 0; i < array.length; i++) {
              if (array[i] % 2 == 0) {
                  array2[j] = array[i];
                  j++;
                  System.out.print(array2[j] + " ");
              }
        }
    }
}
