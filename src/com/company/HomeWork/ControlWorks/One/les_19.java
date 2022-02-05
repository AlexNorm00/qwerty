package com.company.HomeWork.ControlWorks.One;

import java.util.Scanner;

public class les_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LastNumber = 0;
        boolean exit = false;
        char lastSubml = 0;
        while (!exit) {
            boolean exitSumbol = false;
            System.out.println("введите число");
            int numbers = scanner.nextInt();
            System.out.println("Выберите операцию (+,-,/,*,%,=)");
            char subml = scanner.next().charAt(0);
            System.out.println("введите число");
            int numbers2 = scanner.nextInt();
            while (!exitSumbol) {
                if (subml == '+') {
                    LastNumber = numbers + numbers2;
                    exitSumbol = true;
                } else if (subml == '-') {
                    LastNumber = numbers - numbers2;
                    exitSumbol = true;
                } else if (subml == '/') {
                    LastNumber = numbers / numbers2;
                    exitSumbol = true;
                } else if (subml == '*') {
                    LastNumber *= numbers;
                    exitSumbol = true;
                } else {
                    System.out.println("Не верный символ! Попробуйте ещё раз");
                }
            }
            System.out.println(LastNumber);
            System.out.println("1 - продолжить\n2 - выход");
            int d = scanner.nextInt();
            if (d != 1) exit = true;
        }
    }
}
