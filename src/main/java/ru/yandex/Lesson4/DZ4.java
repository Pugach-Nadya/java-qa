package ru.yandex.Lesson4;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class DZ4 {
    /**
     * Функция должна проверять является ли переданный массив
     * отсортированным.
     * <p>
     * 1 2 3 3 4 5 -> true
     * 1 2 1 5 -> false
     * 5 4 1 -> true
     * */
    public static boolean isSorted(int[] array) {
        int length = array.length;
        int lastNumber = array[0];
        boolean result = false;
        for (int i = 1; i < length; i++) {
            if (lastNumber>array[i]){
                result = false;
                break;
            }
            lastNumber = array[i];
            result = true;
        }
        return result;
    }

    /**
     * Функция должна возвращать максимальное произведение
     * двух элементов массива
     * Массив может состоять как из положительных, так и из
     * отрицательных чисел
     * 1 5 3 1 4 -> 4 * 5 = 20
     * */
    public static long maxTwinMultiply(int[] array) {
        int lenght = array.length;
        long result = 0;
        for (int j = 0; j < lenght; j++) {
            for (int k = 0; k < lenght; k++){
                if(j != k){
                    long composition = array[j]*array[k];
                    if (composition>result){
                        result = composition;
                    }
                }
            }
        }
        return result;
    }

    public static String rleCompress(String src) {
        int lenght = src.length();
        char[] a = src.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        int max = 1;
        if(lenght !=1 ) {
            for (int i = 1; i < lenght; i++) {
                char b = a[i];
                char letter = a[i - 1];
                if (b == letter) {
                    letter = b;
                    max++;
                } else {
                    result.add((letter + "(" + max + ")"));
                    letter = b;
                    max = 1;
                }
                if (i == lenght - 1) {
                    result.add((letter + "(" + max + ")"));
                }
            }
        }else {
            result.add(a[0]+"(" + max + ")");
        }
        return result.toString();
    }

    /**
     * 4(a)3(b)1(c)2(d) -> aaaabbbcdd
     * 1(a)1(b)1(c) -> abc
     * 10(a) -> aaaaaaaaaa
     * */
    public static String rleDecompress(String src) {
        int lenght = src.length();
        char[] a = src.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        // с регуляркой работает только для варианта жестко буква(цифра) ,
        // но вот как сделать так что бы было повторение данной комбирации в регулярке не нашла((
        if(Pattern.matches("[a-zA-Z]{1}\\({1}[0-9]{1}\\)", src)){
                    for (int j = 2; j < lenght; j = j + 4) {
                        String q = String.valueOf(a[j]);
                        for (int i = 0; i < Integer.parseInt(q); i++) {
                            char letter = a[j - 2];
                            result.add(String.valueOf(letter));
                        }
                    }
        }else{
            result.add("Вы ввели не верный формат строки!");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] a = {-1, -8, -2, 3, 7};
        String s = "ssss";
        String s1 = "a(2)b(2)";
        boolean r = isSorted(a);
        System.out.println(r);
        long r1 = maxTwinMultiply(a);
        System.out.println(r1);
        String s2 = rleCompress(s);
        System.out.println(s2);
        String s3 = rleDecompress(s1);
        System.out.println(s3);
    }
}
