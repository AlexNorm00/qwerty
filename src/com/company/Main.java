package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
//        System.out.println("Введите число положительное или отрицательное");
//        Scanner sc = new Scanner(System.in);
//        String t=sc.nextInt() < 0 ? "отрицательное" : "положительное";
//        System.out.println("Вы ввели "+ t + " число");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1ое число \n");
        int a = sc.nextInt();
        System.out.println("Введите 2ое число \n");
        int b = sc.nextInt();
        String otv =a!=0 && b!=0? "Ответ "+a/b : "Ошибка деления на 0";
        System.out.println(otv);

    }



}
