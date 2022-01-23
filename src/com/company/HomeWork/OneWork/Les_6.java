package com.company.HomeWork.OneWork;

import java.util.Scanner;

public class Les_6 {
    public static void main(String[] args) {
//        Реализуем калькулятор:
//        Результат должен быть таким:
//        2
//        3
//        1 - Sum
//        2 - Division
//        3 - Differense
//        4 - Multiplication
//        3
//        -1
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int a = sc.nextInt();
        System.out.print("Введите 2-ое число: ");
        int b = sc.nextInt();
        System.out.println("1 - Sum\n2 - Division\n3 - Defferense\n4 - Miltiplication");
        int i = sc.nextInt();
        if (a!=0 && b!=0) {
            if (i == 1) a += b;
            if (i == 2) a /= b;
            if (i == 3) a -= b;
            if (i == 4) a *= b;
        }
        else
            System.out.println("не верное значение");
    }
}
