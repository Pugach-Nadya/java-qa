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
}
