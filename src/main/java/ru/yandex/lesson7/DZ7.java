package ru.yandex.lesson7;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DZ7 {
    public static void enterDateUser() throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Добро пожаловать в программу покупки номера.");
        System.out.println("Внимание, при работе с программой учитывается регистр написания и маски!");
        System.out.print("Хотите начать работу - введите 'да' или 'нет' и нажмите Enter - ");
        String consent = reader.readLine().toString();
        //вот ту то что ввел пользователь не равно тому с чем сравнивает - я сломала голову почему(( но уходит только в else
        if (consent == (String) "да\n" || consent == (String) "нет\n" ){
            if (consent == "нет\n"){
                System.out.println("Спасибо за работу с нашей программой.");
            }else {
                System.out.print("Введите вашу фамилию (пример верного ввода 'Иванов') и нажмите Enter : ");
                String surname = reader.readLine();
                boolean vSurname = verificationSurname(surname);
                if (vSurname == false){
                    System.out.println("Вы не верно ввели имя - " + surname);
                }else {
                    System.out.print("Введите ваше имя (пример верного ввода 'Иван') и нажмите Enter  - ");
                    String name = reader.readLine();
                    boolean vName = verificationName(name);
                }
            }
        }else {
            System.out.println("Вы ввели не верный вариант ответа!");
        }
    }
    public static boolean verificationSurname (String s){
        boolean result = false;
        //самая длинная фамилия 24 буквы
        if (Pattern.matches("[А-Я]{1}[a-z]{1,23}\n", s)){
            result = true;
        }
        return result;
    }
    public static boolean verificationName(String s){
        boolean result = false;
        //самое длинное имя 15 букв
        if (Pattern.matches("[А-Я]{1}[a-z]{1,14}\n", s)){
            result = true;
        }
        return result;
    }

    public static boolean verificationNumber (String s){
        return false;
    }
    public static void main(String[] args) throws IOException {
//        Вам дан файл input_data.txt в нем статистика покупок телефонных номеров в салоне связи.
//        Человек может покупать сколько угодно номеров. Данные в файле - лог
//        покупок. Кто купил и какой номер купил.
//
//        Задание:
//        1. Если продан уже купленный номер - необходимо бросить исключение.
//        Реализуйте функцию поиска таких коллизий
//        2. Напишите функцию, которая возвращает клиентов, у которых куплен ровно 1 телефонный номер
//* 3. Напишите функцию, которая возвращает коллекцию PhoneDetail пользователей,
//        у которых более 1 номера

        enterDateUser();
    }
}
