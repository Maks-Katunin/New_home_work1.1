package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String concatenationWordAndNum;
        final int NUM = 10;
        String word = "This num is ";
        concatenationWordAndNum = word + NUM;
        System.out.println(concatenationWordAndNum);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }else System.out.println("Вы сохранили нуль");

        System.out.println("Введите ваше имя ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Здравствуйте " + name + "!");

    }

}
