package ru.yandex.lesson8;

import javax.swing.text.html.parser.Parser;

public abstract class ChessPiece implements Movement{
//    Необходимо спроектировать классы для игры в шахматы.
//
//    Шахматная доска: содержит в себе массив фигур 8 * 8
//
//    Фигура: имеет х у - координаты на доске, должна уметь двигаться
//    по доске (менять свои координаты). При перемещении в новую клетку
//    доски, фигура должна валидировать ход
//            (проверять можно ли из текущих х у, перейти в новые х у).
//    Например, пешка не может ходить из 1 1 в 5 5.
//
//    Написать несколько реализаций фигур: Ладья, Слон, Конь.
//    Написать тесты на ходы 3 фигур. В тестах создать доску поставить случайно на нее фигуры
//    сделать несколько ходов.
//
//    Если есть время: можно написать все реализации)))

    public int x1;
    public int y1;
    public int x2;
    public int y2;
    static int maxX = 7;
    static int maxY = 7;

    public boolean checkMove (int x1, int y1, int x2, int y2){
        int [] finalXY = null;
        finalXY[0] = x2;
        finalXY[1] = y2;
        int [] exeptXY = move(x1, y1, x2, y2);
        boolean result = false;
        for (int i = 0; i < 2; i++) {
            if(finalXY[i] == exeptXY[i]){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    };

    public boolean validationFinalXY (int x2, int y2){
        try {
            if (x2 > 7 || y2 > 7){
                System.out.println("Вы ввели координаты за пределами доски!");
                return false;
            }else {
                if (x2 <0 || y2 <0 ){
                    System.out.println("Вы ввели отрицательные координаты");
                    return false;};
            };
            return true;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;}
    };
}
