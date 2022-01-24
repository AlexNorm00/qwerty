package com.company.HomeWork.TwoWork;

import java.util.Scanner;

public class Les_13 {
    public static void main(String[] args) {
//        2) Составьте программу. вычисляющую A*B, не пользуясь операцией умножения
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите A:");
        int a = sc.nextInt();
        System.out.print("Введите B:");
        int b = sc.nextInt();
        int summ = 0;
        for (int i = 1; i <= b; i++) summ += a;
        System.out.println("Ответ: " + summ);
    }
}
