package ru.yandex;

import org.junit.jupiter.api.Test;

public class Review_HomeWorkTest {
    @Test
    void TestCheckReverse4Int() {Review_HomeWork.main(String.valueOf(4789));}
    @Test
    void TestCheckReverse3INT() {Review_HomeWork.main(String.valueOf(789));}
    @Test
    void TestCheckReverse4NotInt() {Review_HomeWork.main("abcd");}
    @Test
    void TestCheckReverseNull() {Review_HomeWork.main(null);}
}
