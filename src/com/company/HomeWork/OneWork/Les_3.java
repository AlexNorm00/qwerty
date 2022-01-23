package com.company.HomeWork.OneWork;

import java.util.Scanner;

public class Les_3 {
    public static void main(String[] args) {
//        Пользователь вводит число. Отображаем название дня недели, иначе, что
//        такого дня нет.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7и");
        int a = sc.nextInt();
        String text = a==1? "понедельник" : a==2? "вторник" :a==3? "среда":a==4? "четверг":a==5? "пятница":a==6? "суббота":a==7? "воскресенье":"не определено";
        System.out.print("День недели ");
    }
}
