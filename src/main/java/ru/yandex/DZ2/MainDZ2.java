package ru.yandex.DZ2;

public class MainDZ2 {
    public static void main(String[] args) {
        long SK = 1234;
        long S = 1234;
        String D = "Test";
        System.out.println("Table SKU:");
        SKU s = new SKU(SK, S, D);
        String N = "Point";
        double L = 16, W = 11, H = 20;
        int X =10, Y = 10, Z=10;
        String ZN ="MEZONIN";
        System.out.println("Table Loc:");
        Loc lc = new Loc(SK,N,L,W,H,X,Y,Z,ZN);
        long Q = 2;
        System.out.println("Table Lot:");
        Lot lt = new Lot(SK,s,Q);
    }
}
