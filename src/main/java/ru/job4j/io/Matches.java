package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    int match;
    int min;
    int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Matches(int match, int min, int max) {
        this.match = match;
        this.min = min;
        this.max = max;

    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Вы приглашаетесь сыграть в игру 'Спички'. " + " Введите общее количество спичек участвующих в игре");
        int select = Integer.valueOf(input.nextLine());
        System.out.println(" Введите  минимальное количество спичек, которое можно забирать  за один ход (обычно это 1)");
        int min = Integer.valueOf(input.nextLine());
        System.out.println(" Введите  максимальное количество спичек, которое можно забирать  за один ход");
        int max = Integer.valueOf(input.nextLine());
        Matches model = new Matches(select, min, max);
        boolean run = true;
        System.out.println("Вы приглашаетесь сыграть в игру 'Спички'. " +
                "Всего " + select + " спичек. Можно забирать от " + min + " до " + max + " спичек за ход. " +
                "Игроки ходят по очереди. Проигрывает тот, кто взял последнюю спичку." +
                "Вы готовы? Если готовы - выберите нужное количество спичек и нажмите Enter");
        do {
            select = Integer.valueOf(input.nextLine());

            if (select <= max && select >= min) {
                if (select > 0 && select <= model.getMatch()) {
                    if (model.getMatch() > 0) {
                        if (select <= max && select >= min) {
                            int x = model.getMatch() - select;
                            System.out.println("Осталось " + x + " спичек");
                            model.setMatch(x);
                            if (model.getMatch() <= 0) {
                                System.out.println("Вы проиграли!");
                                System.out.println("Конец игры!");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Это число ввести нельзя!");
                }

            } else {
                System.out.println("Введите правильное число.");
            }

        } while (run) ;
    }
}


