package ru.yandex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.yandex.Lesson3.DZ3;

public class TestDZ3 {
    @ParameterizedTest( name = "{index}Треугольник h = {0} и size = {1}")
    @CsvSource({
            "1,1",
            "2,3",
            "19,37",
            "20,39"
    })
   void testprintTriangleTrue(int h, int size){
        DZ3.printTriangle2(h,size);
    }
    @ParameterizedTest( name = "{index}Треугольник h = {0} и size = {1} ошибка")
    @CsvSource({
            "0,1",
            "1,0",
            "-1,3",
            "3,-1",
            "21,41",
            "2,6"
    })
    void testprintTriangleFalse(int h, int size){
        DZ3.printTriangle2(h,size);
    }
}
