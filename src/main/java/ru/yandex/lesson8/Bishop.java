package ru.yandex.lesson8;

public class Bishop extends ChessPiece implements Movement{

    @Override
    public int[] move(int x1, int y1, int x2, int y2) {
        int [] result = null;
        int stepMoveX = Math.abs(x1 - x2);
        int stepMoveY = Math.abs(y1 - y2);
        if (stepMoveX == stepMoveY && stepMoveX != 0){
            result[0] = x2;
            result[1] = y2;
        }else{
            if (x1==x2 && y1==y2){
                System.out.println("Слон остался на месте!");
            }else {
                System.out.println("Слон не походил!");}
        };
        return result;
    }
}
