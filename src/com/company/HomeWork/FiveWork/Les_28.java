package com.company.HomeWork.FiveWork;

import java.util.Scanner;

public class Les_28 {
    public static void main(String[] args) {
        //Нарисовать в консоли шахматную доску (8x8)
        // (нижняя левая клетка шахматной доски окрашена
        // в чёрный цвет, следующая за ней — в белый, как
        // и та, что над ней. Итак, цвет меняется каждый раз при
        // переходе на соседнюю по стороне ячейку)
        String[][] array2 = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    array2[i][j] = "\u25A1 ";
                } else {
                    array2[i][j] = "\u25A0 ";
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) System.out.print(array2[i][j]);
            System.out.println();
        }
    }
}

