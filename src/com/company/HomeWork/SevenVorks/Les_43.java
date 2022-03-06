//package com.company.HomeWork.SevenVorks;
//
//import java.util.Scanner;
//public class Les_43 {
//    public static void main(String[] args) {
//        //Заполнить массив с консоли (предусмотреть исключительные ситуации) Если пользователь во
//        //время заполнения массива вводит отрицательно число, то инициализацию массива прекратить,
//        // вывести сообщение и закончить программу.Вывести полученный массив с помощью foreach
//        System.out.print("Введите длинну массива: ");
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[scanner.nextInt()];
//        System.out.println("Введите массив.");
//    }
//
//    static int[] inArray(Scanner scanner, int... array){
//        for (int i : array) {
//            System.out.print("Элемент : ");
//            array[i] = scanner.nextInt();
//            if (array[i] <= 0) {
//                System.out.println("Число меньше или равно 0");
//                break;
//            }
//        }
//    }
//}
