package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(4);
        String s = System.lineSeparator();
        System.out.print("Я великий Оракул. Что ты хочешь узнать? " +s);
        System.out.print("Введите закрытый вопрос. " + s +
                "Это вопрос на который можно ответить либо да, либо нет. " + s +
                "Например, \"Будет ли завтра дождь?\"" + random + s);
        String out = scanner.nextLine();
        switch (random){
            case 1 -> System.out.println("Да");
            case 2 -> System.out.println("Нет");
            default -> System.out.println("Возможно");
        }


    }
}
