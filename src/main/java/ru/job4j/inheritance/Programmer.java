package ru.job4j.inheritance;

public class Programmer extends Engineer {
private String science = "mathematics";

    public String getScience() {
        return science;
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        String important = engineer.getEducation();
        Programmer coder = new Programmer();
        String cod = coder.getScience();
        int age = engineer.getAge();
        System.out.println("For a programmer, it is  important to have a" + important + "education and know " + cod + " and be young (minimum " + age + " (at heart)");
    }
}