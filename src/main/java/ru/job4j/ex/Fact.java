package ru.job4j.ex;

public class Fact {

    public static int calc(int n) {
      if (n < 0) {
            throw new IllegalArgumentException("The variable must be greater than 0.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
int x = 3;
        System.out.println(calc(x));
    }


}