package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Выберите номер ДЗ");
        boolean s = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Homework_1;\n0. Выход.");
        int i=-1;
        while (s == false) {
            i = sc.nextInt();
            if (i!=0 || i!=1)
            {
                System.out.println("Недопустимое значение! Попробуйте ещё раз"+i);
            }
            else
            {
                if (i==1) System.out.println("Вы выбрали 1");
                if (i==0) break;
            }

        }
//        System.out.println("Введите число положительное или отрицательное");
//        Scanner sc = new Scanner(System.in);
//        String t=sc.nextInt() < 0 ? "отрицательное" : "положительное";
//        System.out.println("Вы ввели "+ t + " число");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите 1ое число \n");
//        int a = sc.nextInt();
//        System.out.println("Введите 2ое число \n");
//        int b = sc.nextInt();
//        String otv =a!=0 && b!=0? "Ответ "+a/b : "Ошибка деления на 0";
//        System.out.println(otv);

    }


}
