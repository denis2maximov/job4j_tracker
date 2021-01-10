package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    int match;

    public Matches(int x) {
        this.match = x;
    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matches model = new Matches(11);
        boolean run = true;
        System.out.println("Вы приглашаетесь сыграть в игру 'Спички'. " +
                "Всего 11 спичек. Можно забирать от 1 до 3 спичек за ход. " +
                "Игроки ходят по очереди. Проигрывает тот, кто взял последнюю спичку." +
                "Вы готовы? Если готовы - выберите нужное количество спичек и нажмите Enter");
        do  {
            int select = Integer.valueOf(input.nextLine());
            if (select > 0 && select <= model.getMatch()) {
                if (model.getMatch() > 0) {
                    if (select == 3) {
                        int x = model.getMatch() - select;
                        System.out.println("Осталось " + x + " спичек");
                        model.setMatch(x);
                        if (model.getMatch() <= 0) {
                            System.out.println("Вы проиграли!");
                            System.out.println("Конец игры!");
                            break;
                        }

                    } else if (select == 1) {
                        int x = model.getMatch() - select;
                        System.out.println("Осталось " + x + " спичек");
                        model.setMatch(x);
                        if (model.getMatch() <= 0) {
                            System.out.println("Вы проиграли!");
                            System.out.println("Конец игры!");
                            break;
                        }

                    } else if (select == 2) {
                        int x = model.getMatch() - select;
                        System.out.println("Осталось " + x + " спичек");
                        model.setMatch(x);
                        if (model.getMatch() <= 0) {
                            System.out.println("Вы проиграли!");
                            System.out.println("Конец игры!");
                            break;
                        }
                    } else {
                        System.out.println("Введите правильное число.");
                    }
                }
                } else {
                System.out.println("Это число ввести нельзя!");
            }
            } while (run);
        }
    }

