package com.company.HomeWork.OneWork;
import java.util.Scanner;

public class Les_1 {
    public static void main(String[] args) {
//        Пользователь вводит 3 числа. Найти максимальное и вывести его. Решить 2
//        способами: 1-через вложенный if, т.е if(condition){if(condition)…}…, 2 –
//        используя логические операции
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int a = sc.nextInt();
        System.out.print("Введите 2-ое число: ");
        int b = sc.nextInt();
        System.out.print("Введите 3-ое число: ");
        int c = sc.nextInt();
        int s = c;
        if (a > b && a > c) s = a;
        else if (b > c && b > a) s = b;
        System.out.println("Максимальное число: " + s);
    }
}
