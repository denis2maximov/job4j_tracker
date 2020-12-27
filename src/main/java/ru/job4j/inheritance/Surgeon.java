package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    private String cutting = "cutting";
    private String sewup = "sew up";

    public String getCutting() {
        return cutting;
    }
    public String getSewup() {
        return sewup;
    }


    public static void main(String[] args) {
        Doctor doc = new Doctor();
        String name = doc.getName();
        Surgeon cut = new Surgeon();
        String cutte = cut.getCutting();
        Surgeon sew = new Surgeon();
        String sewup= sew.getSewup();
        System.out.println("The surgeon " + name + " can " + cutte + " and " + sewup + ".");
    }
}
