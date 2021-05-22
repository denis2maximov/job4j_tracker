package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель аккаунта пользователя. Две переменных:
 * реквизиты счета и баланс.
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     * конструктор модели аккаунт.
     * @param requisite - строковое представление счета
     * @param balance - числовое представление
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * получение реквизитов аккаунта
     * @return requisite
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * запись реквизитов аккаунта.
     * принимает строковое значение
     * @param requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * получение баланса аккаунта
     * @return
     */

    public double getBalance() {
        return balance;
    }

    /**
     * запись баланса аккаунта
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * переопределяем метод equals для возможности
     * сравнения аккаунтов. Сравниваем по реквизитам.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * переопределяем метод, что бы хэшкод аккаунта был
     * requisite
     * @return requisite
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
