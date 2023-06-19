package ru.yandex;

import java.util.Scanner;

public class Review_HomeWork {
    public static void reverse (int a)
    {
        int a1 = (int) a / 1000;
        int a2 = (int) (a - (a1*1000))/100;
        int a3 = (int) (a - (a1*1000) - (a2*100))/10;
        int a4 = a % 10;
        System.out.printf("Итоговое число = "+ a4 + a3 + a2 + a1);
    }

    public static boolean checkString(String st)
    {
        if (st == null)
        {
            System.out.println("Вы ввели пустую строку!");
            return false;
        }
        if (st.length() != 4)
        {
            System.out.println("Вы ввели значение меньше 4-х символов!");
            return false;
        }
        try {
            int valueSt = Integer.parseInt(st);
            boolean b = true;
            return b;
        }catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Привет, введи четерех значное число \n");
        String st = in.nextLine();
        boolean p = checkString(st);
        if (p == true) {
            int a = Integer.parseInt(st);
            reverse(a);
        }
    }
}
