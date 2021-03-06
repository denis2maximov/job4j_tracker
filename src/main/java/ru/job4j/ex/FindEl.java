package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String x : value) {
                if (value[index].equals(key)) {
                 return index;
            }
                index++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("This value is not in the array");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] name = new String[]{"Game", "Troll", "Vasia", "switch"};
     try {
           int string = indexOf(name, "Vasia22");
         System.out.println(string);
       } catch (ElementNotFoundException e) {
           e.printStackTrace();
     }
     }
}
