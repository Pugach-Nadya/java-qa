package ru.yandex.lesson8;

public class Rook extends ChessPiece implements Movement{

    public int[] move (int x1, int y1, int x2, int y2){
        int [] result = null;
        int stepMoveX = x2 - x1;
        int stepMoveY = y2 - y1;
        if (stepMoveX == 0 || stepMoveY == 0) {
            result[0] = x2;
            result[1] = y2;
        }else {
            if (x1==x2 && y1==y2){
                System.out.println("Ладья осталась на месте");
            }else {
            System.out.println("Ладья не походила!");}
        }
        return result;
    };

}
