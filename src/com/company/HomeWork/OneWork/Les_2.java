package com.company.HomeWork.OneWork;
import java.util.Scanner;

public class Les_2 {
    public static void main(String[] args) {
//        Пользователь вводит 2 числа. Проверить кратное ли первое второму
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int a = sc.nextInt();
        System.out.print("Введите 2-ое число: ");
        int b = sc.nextInt();
        if(a%b==0) System.out.print("Число "+a+" кратное числу "+b);
        else System.out.print("Число "+a+" некратное числу "+b);
    }
}
