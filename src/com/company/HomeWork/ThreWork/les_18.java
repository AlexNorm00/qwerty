package com.company.HomeWork.ThreWork;

import java.util.Scanner;

public class les_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа для проверки на полиндром:");
        String InitialText = scanner.nextLine();
        String LastText = "";
        boolean s = true;
        for (int i = InitialText.length()-1, j = 0; i >= 0 && j <= InitialText.length()-1; i--, j++) {
            int a = InitialText.charAt(i);
            int b = InitialText.charAt(j);
            if (a != b){
                 s = false;
                break;
            }
        }
        if (s) System.out.println("Число полиндром");
        else System.out.println("Не являетьс полиндромом");
    }
}
