package com.company.HomeWork.FourWork;

import java.util.Arrays;
import java.util.Random;

public class Les_26 {
    public static void main(String[] args) {
        //Есть массив слов. Нужно инвертировать его порядок.
        Random random = new Random();
        int[] array = new int[20];
        int[] array2 = new int[20];
        for (int i = 0, j = array2.length - 1; i < array.length; i++, j--) {
            array[i] = random.nextInt(50);
            array2[j] = array[i];
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i]+" ");
        }
    }
}
