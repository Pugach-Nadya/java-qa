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

    public Loc withSerialKey(SKU S) {
        this.serialKey = S.getSerialKey();
        return this;
    }
    public Loc withName (String N){
        this.name = N;
        return this;
    }

    public Loc withLength (double L){
        this.length = L;
        return this;
    }

    public Loc withWidth (double W){
        this.width = W;
        return this;
    }
    public  Loc withHeight (double H){
        this.height = H;
        return this;
    }

    public  Loc withX (int X){
        this.x = X;
        return this;
    }
    public  Loc withY (int Y){
        this.y = Y;
        return this;
    }
    public  Loc withZ (int Z){
        this.z = Z;
        return this;
    }

    public Loc withZone (String ZN){
        this.zone = ZN;
        return this;
    }

    private Loc (long SK,String N,double L,double W,double H,int X, int Y,int Z,String ZN){
        this.serialKey = SK;
        this.name = N;
        this.length = L;
        this.width = W;
        this.height = H;
        this.x = X;
        this.y = Y;
        this.z = Z;
        this.zone = ZN;
    }
    public Loc bulder(){
        return new Loc(serialKey,name,length,width,height, x, y, z, zone);
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
