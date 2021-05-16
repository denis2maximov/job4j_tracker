package ru.job4j.inheritance;

 public class Programmer extends Engineer {

     private String science;

     public Programmer(String a, String b, String c, int d, int e, String f) {
         super(a, b, c, d, e);
         science = f;
     }

     public static void main(String[] args) {
         Programmer proger = new Programmer("Alla", "Demidova", "different", 24, 55, "mathematics");

         System.out.println("For a programmer, it is  important to have a "
                 + proger.getEducation() + " education and know " + proger.science
                 + " and be young (minimum " + proger.getAge() + " (at heart)");
     }
 }
