package com.company.HomeWork.TwoWork;

public class Les_10 {
    public static void main(String[] args) {
//        3)Напишите программу, определяющую сумму всех нечётных чисел от 1 до 99
        int i = 1;
        int sum=0;
        while (i<100){
            if (i%2!=0) {
                sum+=i;
                System.out.println(sum+" "+i);
            }
            i++;
        }
    }
}
