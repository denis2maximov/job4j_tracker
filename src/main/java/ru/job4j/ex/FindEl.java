package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        /* for-each */
       for (String x : value) {
           rsl++;

     if (x == null) {
                       throw new ElementNotFoundException("This value is not in the array");
           }
     if (key == x) {
                  return rsl;
                 }
               }
            for (int i = 0; i < value.length; i++) {
                if (value[i] == key) {

                  return rsl = i;
                }
            }

        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] name = new String[]{"Game", "Troll", "Vasia", "switch", null};
     try {
           int string = indexOf(name, "22");
       } catch (ElementNotFoundException e) {
           e.printStackTrace();
       //  System.out.println("Повторный перехват исключения " + e);
     }
     }
}
