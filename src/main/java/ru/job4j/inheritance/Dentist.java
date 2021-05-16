package ru.job4j.inheritance;

 public class Dentist extends Doctor {
     private int cash;

     Dentist(String a, String b, String c, int d, int e, int f) {
         super(a, b, c, d, e);
         System.out.println("тут мы узнаем сколько зарабатывает дантист : " + f + " баксов");
         cash = f;
     }

   public static void main(String[] args) {
       Dentist zub  = new Dentist("Олег", "Зубастов", "Самое лучшее!", 18, 120, 5);

       System.out.println("the dentist " + zub.getName() + " weighs "
               + zub.getWeight() + " kilograms and charges " + zub.cash + " bucks for a tooth.");
    }
}
