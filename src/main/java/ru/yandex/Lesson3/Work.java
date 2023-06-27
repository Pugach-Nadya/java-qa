package ru.yandex.Lesson3;

public class Work {
    public static boolean canRook(int x1, int y1, int x2, int y2){
        return (x1 == x2 || y1 == y2) && !((x1 == x2 && y1 == y2));
    }
    public static boolean canBishop(int x1, int y1, int x2, int y2){
        if (Math.abs(x2-x1) == Math.abs(y2-y1)){
            return true;
        }else {
            return false;}
    }

    public static int length (int value){
        int i = 0;
        boolean b = true;
        do{
            int l = value % 10;
            if(l>0){
                i++;
                b = true;
            }else {
                b = false;}
        } while (b == true);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(length(4567));
    }
}
