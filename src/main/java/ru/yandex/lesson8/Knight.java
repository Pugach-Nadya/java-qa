package ru.yandex.lesson8;

public class Knight extends ChessPiece implements Movement{

    @Override
    public int[] move(int x1, int y1, int x2, int y2) {
        int [] result = null;
        int stepMoveX = Math.abs(x1 - x2);
        int stepMoveY = Math.abs(y1 - y2);
        if((stepMoveX == 1 && stepMoveY == 2) || (stepMoveX == 2 && stepMoveY==1)){
            result[0]=x2;
            result[1]=y2;
        }else{
            if (x1==x2 && y1==y2){
                System.out.println("Конь остался на месте");
            }else {
                System.out.println("Конь не походил!");}
        };
        return result;
    }
}
