package com.company.HomeWork.FourWork;

import java.util.Scanner;

public class Les_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1,2,2,3,4
        System.out.print("Введите длинну массива: ");
        int[] mas = new int[scanner.nextInt()];
        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введите число №" + i + ": ");
            mas[i] = scanner.nextInt();
            //    if(mas[i]%2!=0) mas[i]=0;
        }
        System.out.println("Введите число для сравнения");
        int Dodo = scanner.nextInt();
        int j = 0;
        while (j < mas.length) {
            System.out.print(mas[j] == Dodo ? "Число присутвует на позиции " + j + "\n" : "");
            j++;
        }
        double GetSum = 0;
        for (int i : mas) {
            GetSum += i;
            System.out.print(i + " ");
        }

        System.out.println("\nСумма чисел массива ровна " + GetSum);
        System.out.println("Среднее арифметическое " + GetSum / mas.length);
    }
}
