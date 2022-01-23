package com.company.HomeWork.OneWork;

import java.util.Scanner;

public class Les_5 {
    public static void main(String[] args) {
//        Пользователь вводит месяц в виде числа от 1 до 12 Определите в какую пору
//        года попадает этот месяц (зима, лето, весна, осень).
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12и");
        int a = sc.nextInt();
        switch (a) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не верное значение");
        }
    }
}
