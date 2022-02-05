package com.company.HomeWork.ControlWorks.One;

public class les_20 {
    public static void main(String[] args) {
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
