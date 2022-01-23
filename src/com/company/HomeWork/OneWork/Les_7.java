package com.company.HomeWork.OneWork;

import java.util.Scanner;

public class Les_7 {
    public static void main(String[] args) {
//        Вместо того, чтобы выбирать операцию по числу (1 – sum, 2 – division и тп),
//        используем символы, т.е результат должен быть таким:
//      2  3
//      + - Sum
//      / - Division
//      - - Defferense
//      * - Miltiplication
//      -
//      -1
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int a = sc.nextInt();
        System.out.print("Введите 2-ое число: ");
        int b = sc.nextInt();
        System.out.println("+ - Sum\n/ - Division\n- - Defferense\n* - Miltiplication");
        String i = sc.nextLine();
        if (a!=0 && b!=0) {
            if (i == "+") a += b;
            if (i == "/") a /= b;
            if (i == "-") a -= b;
            if (i == "*") a *= b;
        }
        else
            System.out.println("не верное значение");
    }
}
