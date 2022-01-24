package com.company.HomeWork.TwoWork;

public class Les_11 {
    public static void main(String[] args) {
//        4)Даны числа от 0 до 100
//        -Посчитать сумму чётных чисел и вывести на экран
//        -Посчитать сумму нечётных чисел и вывести на экран
//        -Найти общую сумму всех чисел
        int evenNumbers = 0;
        int oddNumbers = 0;
        int allNumbers = 0;
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) evenNumbers += i;
            else oddNumbers += i;
            allNumbers += i;
            i++;
        }
        System.out.println("Сумма чётных чисел: " + evenNumbers);
        System.out.println("Сумма не чётных чисел: " + oddNumbers);
        System.out.println("Сумма всех чисел: " + allNumbers);
    }
}
