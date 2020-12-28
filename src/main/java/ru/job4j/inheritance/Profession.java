package ru.job4j.inheritance;

public class Profession {
  /*  private String name = "Oleg";
    private String surname = "Modamen";
    private String education = "best";
    private int age = 100;
    private int weight = 90; */
   private String name;
    private String surname;
    private String education;
    private int age;
    private int weight;

     Profession(String a, String b, String c, int d, int e){
         name = a;
         surname = b;
         education = c;
         age = d;
         weight = e;
        }


    public String getName() {
        return name;
    }

  public String getSurname() {
        return surname;
    }

    public  String getEducation() {
        return education;
    }

    public  int getAge() {
        return age;
    }

    public  int getWeight() {
        return weight;
    }

}