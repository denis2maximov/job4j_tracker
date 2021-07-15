package ru.job4j.stream;

public class Transformer {
    private String name;

    private String type;

    private String power;

    private int gun;

    private boolean tracks;

    private boolean rockets;

    private String color;

static class Builder {
    private String name;

    private String type;

    private String power;

    private int gun;

    private boolean tracks;

    private boolean rockets;

    private String color;

    Builder buildName(String name) {
        this.name = name;
        return this;
    }

    Builder buildType(String type) {
        this.type = type;
        return this;
    }

    Builder buildPower(String power) {
        this.power = power;
        return this;
    }

    Builder buildGun(int gun) {
        this.gun = gun;
        return this;
    }

    Builder buildTracks(Boolean tracks) {
        this.tracks = tracks;
        return this;
    }

    Builder buildRockets(boolean rockets) {
        this.rockets = rockets;
        return this;
    }

    Builder buildColor(String color) {
        this.color = color;
        return this;
    }

    Transformer build() {
        Transformer transformer = new Transformer();
        transformer.name = name;
        transformer.type = type;
        transformer.power = power;
        transformer.gun = gun;
        transformer.tracks = tracks;
        transformer.rockets = rockets;
        transformer.color = color;
        return transformer;
    }
}

    @Override
    public String toString() {
        return "Transformer{"
                + "name='" + name + '\''
                + ", type='" + type + '\''
                + ", power='" + power + '\''
                + ", gun=" + gun
                + ", tracks=" + tracks
                + ", rockets=" + rockets
                + ", color='" + color + '\''
                + '}';
    }

    public static void main(String[] args) {
        Transformer user = new Builder().buildName("Parkinson")
                .buildColor("Red")
                .buildType("AutoBot")
                .buildPower("10000000")
                .buildGun(10)
                .buildTracks(true)
                .buildRockets(false)
                .build();
         System.out.println(user);
    }
}
