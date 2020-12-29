package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student item = new Student();
        item.setFullName("Oleg Arzamasov");
        item.setData("04.05.1628");
        item.setGroup("Group #14");
        System.out.println("Фамилия, имя : " + item.getFullName() + " Дата поступления : " +
                item.getData() + " Группа : " + item.getGroup());
    }
}
