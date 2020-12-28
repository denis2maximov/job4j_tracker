package ru.job4j.inheritance;

 public class Surgeon extends Doctor {
     private String cutting;
     private String sewup;

     public Surgeon (String a, String b, String c, int d, int e, String f, String z){
         super( a, b, c, d, e);
         cutting = f;
         sewup = z;
     }

     public void show() {
         String a = getName();
         String b = getEducation();
         System.out.println(a + " has a " + b + " education");
     }

    public static void main(String[] args) {
        Surgeon cut = new Surgeon("Sergey", "Ostriy", "medic", 26, 85, "cutting", "sew up");
        System.out.println("The surgeon " + cut.getName() + " can " + cut.cutting + " and " + cut.sewup + ".");
        cut.show();
    }
}
