package ru.job4j.inheritance;

public class Builder extends  Engineer{
    private String sudo;
    private String bash;

    public Builder(String a, String b, String c, int d, int e, String f, String x){
         super(a, b, c, d, e);
         bash = x;
         sudo = f;
     }

    public static void main(String[] args) {
      Builder dev = new Builder("Oleg", "Modomov", "best practice", 16, 120, "sudo", " bash");
        System.out.println(dev.getSurname() + " programmer uses " + dev.getEducation() + " of " + dev.sudo + dev.bash);
    }

}
