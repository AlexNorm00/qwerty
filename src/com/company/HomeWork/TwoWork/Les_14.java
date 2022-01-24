package com.company.HomeWork.TwoWork;
//TEXT FORMATTING
//+
public class Les_14 {
    public static void main(String[] args) {
//        Апишите программу печати таблицы перевода расстояний из дюймов в сантиметры для
//        значений длинн от 1 до 20 дюймов. 1 дюйм = 2,54 см
        System.out.println("дюйм        см");
        final double inch=2.54;
        //naming could be better
        double inchAll=0;
        for (int i=1;i<=20;i++)
        {
            inchAll+=inch;
            System.out.println(i+"        "+inchAll);
        }
    }
}
