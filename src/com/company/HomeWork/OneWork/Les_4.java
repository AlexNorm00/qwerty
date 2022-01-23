package com.company.HomeWork.OneWork;

import java.util.Scanner;

public class Les_4 {
    public static void main(String[] args) {
//        Пользователь вводит число. Отображаем название дня недели, иначе, что
//        такого дня нет (т.е переписать 2.3 с другой конструкцией)
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7и");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Понедельник"); break;
            case 2:
                System.out.println("Вторник"); break;
            case 3:
                System.out.println("Среда"); break;
            case 4:
                System.out.println("Четверг"); break;
            case 5:
                System.out.println("Пятница"); break;
            case 6:
                System.out.println("Суббота"); break;
            case 7:
                System.out.println("Воскресенье"); break;
            default:
                System.out.println("Ввели не верное значение"); break;
        }
    }
}
