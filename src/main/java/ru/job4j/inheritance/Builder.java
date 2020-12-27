package ru.job4j.inheritance;

public class Builder extends  Engineer{
    private String sudo = "bash";

    public String getOs(){
      Engineer devops = new Engineer();
      String dev = devops.getOs();
        return dev;
    }

}
