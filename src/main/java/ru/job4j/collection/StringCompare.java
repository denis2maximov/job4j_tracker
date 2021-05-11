package ru.job4j.collection;
import ru.job4j.condition.Max;

import java.util.Comparator;
import static java.lang.Character.isDigit;
/**
 * Comparable
 * Строки являются comparable, т.е. реализуют метод compareTo.
 * Выполняется это при помощи посимвольного сравнения.
 * Интересно, что из двух строк выбирается минимальная длинна
 * и по ней выполняется цикл. Поэтому, compareTo вернёт
 * или разницу между int значениями первых несовпавших символов
 * в пределе наименьшей из длинн строк, либо вернёт разницу между длиннами строк,
 * если в пределах минимальной длинны строки все символы совпадают.
 * Такое сравнение называется «лексикографическим».
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        String first = left.length() > right.length() ? right : left;
        String second = first.equals(right) ? left : right;
        for (int i = 0; i < first.length(); i++) {
            char x = first.charAt(i);
            char y = second.charAt(i);
            if (i != first.length()) {
                rsl = Character.compare(x, y);
                           // rsl = (x < y) ? -1 : ((x == y) ? 0 : 1);
                if (rsl != 0) {
                    break;

                } else {
                    if (rsl == 0 && first.length() < second.length()) {
                        rsl = first.length() + rsl;
                    }
                }
            }
        }
        return rsl;
    }
}