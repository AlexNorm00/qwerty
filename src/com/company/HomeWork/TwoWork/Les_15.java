package com.company.HomeWork.TwoWork;

public class Les_15 {
    public static void main(String[] args) {
//        4) Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал
//        дневную норму на 10% нормы предыдущего дня. Какой ссумарный путь пробежит спотсмен
//        а 7 дней?
        double distanse=10;
        for (int i=1;i<=7;i++)
        {
            System.out.println("Дистанция в "+i+" день: "+distanse);
            distanse+=distanse/10;
        }
    }
}
