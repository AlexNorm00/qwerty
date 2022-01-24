package com.company.HomeWork.TwoWork;

//Your solution is interesting, actually:)
//Try to do it using inner loops
public class Les_16 {
    public static void main(String[] args) {
//        5)**** Можете попрактиковаться и нарисовать оставшиеся 2 треугольника
//           * (1)                **** (2)
//          **                     ***
//         ***                      **
//        ****                       *
//        1-й
        char star = '*';
        String text = "";
        for (int i = 0; i < 4; i++) {
            //for future: not good memory usage. StringBuilder is preferred in your solution
            text += star;
            System.out.println(text);
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(text);
            text = text.substring(0, text.length() - 1);
        }

        // через вложеный for
        // №1
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // №2
        System.out.println();
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
