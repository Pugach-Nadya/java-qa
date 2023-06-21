package ru.yandex;

//итоговое решение задачи 1 + тесты отдельно
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

    //итоговое решение задачи 2 - исправила и задачу и АТ
    public static String difference (String st)
    {
        if (st == null)
        {
            String finalSt = ("Вы ввели пустую строку!");
            return finalSt;
        }
        try {
            int a = Integer.parseInt(st);
            char first = st.charAt(0);
            if (first == '-')
            {
                String finalSt = ("Вы ввели отрицательное число!");
                return finalSt;
            }
            if (a < 10 && a>=0)
            {
                String finalSt = ("Вы ввели не число меньше 10!");
                return finalSt;
            }
            if (a > 9999)
            {
                String finalSt = ("Вы ввели не число больше 9999!");
                return finalSt;
            }
            if (st.length() == 2 && a>0)
            {
                int a1 = (int) a / 10;
                int a2 = a % 10;
                String part2 = String.valueOf(""+a2 +""+ a1);
                int result = a - Integer.parseInt(part2);
                String finalSt = ("Итоговое число = " + result);
                return finalSt;
            }
            if (st.length() == 3 && a>0)
            {
                int part1 = (int) a / 10;
                int a1 = (a / 100);
                int part2 = a - a1*100;
                int result = part1 - part2;
                String finalSt = ("Итоговое число = " + result);
                return finalSt;
            }
            if (st.length() == 4 && a>0)
            {
                int part1 = (int) a / 100;
                int part2 = a - part1*100;
                int result = part1 - part2;
                String finalSt = ("Итоговое число = " + result);
                return finalSt;
            }
        }catch (NumberFormatException e) {
            String finalSt = ("Вы ввели не целое число!");
            return finalSt;
        }
        return ("Неизвестная ошибка");
    }
}
