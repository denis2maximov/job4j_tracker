package ru.job4j.ooa;

import java.util.Objects;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void printCountEngine() {
        //COUNT_ENGINE = 4;
        if (name.equals("A380")) {
            System.out.println("Количество двигателей равно: " + 4);
        } else {
            System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airbus airbus = (Airbus) o;
        return Objects.equals(name, airbus.name);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}