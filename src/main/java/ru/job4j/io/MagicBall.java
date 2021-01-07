package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
            Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = random.nextInt(3);

       switch (answer) {
           case (0) :
               String first = "Да";
               System.out.println(first);
                break;
           case (1) :
               String second = "Нет";
               System.out.println(second);
                 break;
           default:
               String tree = "Может быть";
               System.out.println(tree);
               break;
       }

    }
}
