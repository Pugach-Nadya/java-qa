package ru.yandex.Lesson3;

public class DZ3 {
    private int h; //высота треугольника
    private int size; //основание треугольника в *
    //       *
    //      ***
    //     *****
    //    *******
    public static void printTriangle2(int H, int S) {
        int h = H;
        int size = S;
        if(h<=0){
            System.out.println("Высота не может быть нулевой или отрицательной!");
        }
        if(size<=0){
            System.out.println("Основание не может быть нулевым или отрицательным!");
        }
        if(h>20){
            System.out.println("Извините, не можем нарисовать треугольник выше 20!");
        }else {
        if (size == (h*2-1)){
            int i;
            for (i = 1; i <=h;i++){
                int p = h-i; //кол-во пробелов
                for (int j = 1;j<=p;j++){
                    System.out.print(" ");
                }
                int z = size-p*2; //кол-во звездочек
                for (int k = 1;k<=z;k++){
                    System.out.print("*");
                }
                System.out.println();
                }
        }else{
            System.out.println("Вы ввели не верное основание для данной высоты!");
        }}
    }

    public static void main(String[] args) {
        int h1 = 0, sz1 = 1;
        printTriangle2(h1,sz1);
    }
}
