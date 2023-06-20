package ru.yandex;

import java.util.Scanner;

public class Review_HomeWork {
    public static String reverse (String st)
    {
        if (st == null)
        {
            String finalSt = ("Вы ввели пустую строку!");
            return finalSt;
        }
        if (st.length() != 4)
        {
            String finalSt = ("Вы ввели значение меньше 4-х символов!");
            return finalSt;
        }
        try {
            int a = Integer.parseInt(st);
            int a1 = (int) a / 1000;
            int a2 = (int) (a - (a1*1000))/100;
            int a3 = (int) (a - (a1*1000) - (a2*100))/10;
            int a4 = a % 10;
            String finalSt = ("Итоговое число = "+ a4 + a3 + a2 + a1);
            return finalSt;
        }catch (NumberFormatException e) {
            String finalSt = ("Вы ввели не число!");
            return finalSt;
        }
    }

    public static void main(String st) {
    }
}
