package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Review_HomeWorkTest {
    @Test
    void TestCheckReverse4Int()
    {
        String actually = Review_HomeWork.reverse(String.valueOf(4789));
        String expected= "Итоговое число = 9874";
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void TestCheckReverse3INT()
    {
        String actually = Review_HomeWork.reverse("AA00");
        String expected= "Вы ввели не число!";
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void TestCheckReverse4NotInt()
    {
        String actually = Review_HomeWork.reverse(String.valueOf(789));
        String expected= "Вы ввели значение меньше 4-х символов!";
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void TestCheckReverseNull()
    {
        String actually = Review_HomeWork.reverse(null);
        String expected= "Вы ввели пустую строку!";
        Assertions.assertEquals(expected, actually);
    }
// проверка тестами второй функции
    @Test//проверка нна пустую строку
    void TestCheckDifferenceNull()
    {
        String actually = Review_HomeWork.difference(null);
        String expected= "Вы ввели пустую строку!";
        Assertions.assertEquals(expected, actually);
    }
    @Test//проверка на ноль
    void TestCheckDifferenceEqual0()
    {
        String actually = Review_HomeWork.difference(String.valueOf(0));
        String expected= "Вы ввели не число меньше 10!";
        Assertions.assertEquals(expected, actually);
    }
    @Test//цифры меньше нуля - отрицательные
    void TestCheckDifferenceUnder0()
    {
        String actually = Review_HomeWork.difference(String.valueOf(-1));
        String expected= "Вы ввели отрицательное число!";
        Assertions.assertEquals(expected, actually);
    }
    @Test//цифры меньше 10 но больше 0
    void TestCheckDifferenceUnder10()
    {
        String actually = Review_HomeWork.difference(String.valueOf(9));
        String expected= "Вы ввели не число меньше 10!";
        Assertions.assertEquals(expected, actually);
    }
    @Test//проверка что число меньше 9999
    void TestCheckDifferenceMore9999()
    {
        String actually = Review_HomeWork.difference(String.valueOf(10000));
        String expected= "Вы ввели не число больше 9999!";
        Assertions.assertEquals(expected, actually);
    }
    @Test//двухзначные - цифры с 12, 13 до 19 где после разделения часть1 меньше части 2
    void TestCheckDifference2Part1UnderPart2()
    {
        String actually = Review_HomeWork.difference(String.valueOf(12));
        String expected= "Итоговое число = -9";
        Assertions.assertEquals(expected, actually);
    }
    @Test //двухзначные - две одинаковые цифры в двоичном числе
    void TestCheckDifference2IdenticalNumber()
    {
        String actually = Review_HomeWork.difference(String.valueOf(22));
        String expected= "Итоговое число = 0";
        Assertions.assertEquals(expected, actually);
    }
    @Test //двухзначные - цифры, где после разделения часть1 больше части 2
    void TestCheckDifference2Part1MorePart2()
    {
        String actually = Review_HomeWork.difference(String.valueOf(21));
        String expected= "Итоговое число = 9";
        Assertions.assertEquals(expected, actually);
    }
    @Test//трехзначные - цифры, где после разделения часть1 меньше части 2
    void TestCheckDifference3Part1UnderPart2()
    {
        String actually = Review_HomeWork.difference(String.valueOf(121));
        String expected= "Итоговое число = -9";
        Assertions.assertEquals(expected, actually);
    }
    @Test //трехзначные - цифры, где после разделения часть1 = части 2
    void TestCheckDifference3Part1EqualPart2()
    {
        String actually = Review_HomeWork.difference(String.valueOf(222));
        String expected= "Итоговое число = 0";
        Assertions.assertEquals(expected, actually);
    }
    @Test //трехзначные - цифры, где после разделения часть1 больше части 2
    void TestCheckDifference3Part1MorePart2()
    {
        String actually = Review_HomeWork.difference(String.valueOf(212));
        String expected= "Итоговое число = 9";
        Assertions.assertEquals(expected, actually);
    }
    @Test//четырехзначные- цифры, где после разделения часть1 меньше части 2
    void TestCheckDifference4Part1UnderPart2()
    {
        String actually = Review_HomeWork.difference(String.valueOf(1099));
        String expected= "Итоговое число = -89";
        Assertions.assertEquals(expected, actually);
    }
    @Test //четырехзначные - цифры, где после разделения часть1 = части 2
    void TestCheckDifference4Part1EqualPart2()
    {
        String actually = Review_HomeWork.difference(String.valueOf(2222));
        String expected= "Итоговое число = 0";
        Assertions.assertEquals(expected, actually);
    }
    @Test //четырехзначные - цифры, где после разделения часть1 больше части 2
    void TestCheckDifference4Part1MorePart2()
    {
        String actually = Review_HomeWork.difference(String.valueOf(9998));
        String expected= "Итоговое число = 1";
        Assertions.assertEquals(expected, actually);
    }
}
