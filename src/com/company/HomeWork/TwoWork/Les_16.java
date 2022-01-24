package com.company.HomeWork.TwoWork;

public class Les_16 {
    public static void main(String[] args) {
//        5)**** Можете попрактиковаться и нарисовать оставшиеся 2 треугольника
//           * (1)                **** (2)
//          **                     ***
//         ***                      **
//        ****                       *
//        1-й
        char star='*';
        String text="";
        for (int i = 0; i < 4; i++) {
            text+=star;
            System.out.println(text);
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(text);
            text = text.substring(0,text.length()-1);
        }
    }
}
