package com.company.HomeWork.TwoWork;

public class Les_12 {
    public static void main(String[] args) {
//        1)Одноклеточная амёба каждые 3 часа делиться на 2 клетки. Определить,
//        сколько амёб будет через 3, 6, 9, 12,...,24 часа
        int amoeba=1;
        for (int i=0;i<=24;i+=3) amoeba*=2;
        System.out.println(amoeba);
    }
}
