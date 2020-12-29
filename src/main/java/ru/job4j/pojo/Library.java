package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Advebture", 509);
        Book book2 = new Book("Clean code", 780);
        Book book3 = new Book("Gold key", 236);
        Book book4 = new Book("Alphabet book Java", 450);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book full : books) {
            System.out.println(full.getName() + " - " + full.getQuantity());
        }
        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;
        for (Book exchange : books) {
            System.out.println(exchange.getName() + " - " + exchange.getQuantity());
        }
            System.out.println(" ");
        for (Book clean : books) {
            String rsl = clean.getName();
            if ("Clean code".equals(rsl)) {
                System.out.println(rsl);
            }
        }

        }
}
