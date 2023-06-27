package ru.yandex.DZ2;

//Loc: serialKey(long), name(String), length(double), width(double), height(double),
// x(int), y(int), z(int), zone(String)
public class Loc {
    private long serialKey;
    private String name;
    private double length;
    private double width;
    private double height;
    private int x;
    private int y;
    private int z;
    private String zone;

    public Loc (long SK,String N,double L,double W,double H,int X, int Y,int Z,String ZN){
        this.serialKey = SK;
        this.name = N;
        this.length = L;
        this.width = W;
        this.height = H;
        this.x = X;
        this.y = Y;
        this.z = Z;
        this.zone = ZN;
        System.out.println("serialKey = "+getSerialKey());
        System.out.println("name = "+getName());
        System.out.println("length = "+getLength());
        System.out.println("windth = "+getWidth());
        System.out.println("heigth = "+getHeight());
        System.out.println("x = "+getX());
        System.out.println("y = "+getY());
        System.out.println("z = "+getZ());
        System.out.println("zone = "+getZone());
    }

    public long getSerialKey() {
        return serialKey;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getZone() {
        return zone;
    }
}
