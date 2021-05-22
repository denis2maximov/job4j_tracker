package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель пользователя. Имеет 2 переменные passport  и username.
  */
public class User {
    private String passport;
    private String username;

    /**
     *Конструтор шаблона User, принимает на вход строковые параметры:
     * @param passport - паспорт пользователя
     * @param username - имя пользователя.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер паспорта юзера, обспечивает получение паспорта по User
    */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер паспорта юзера, обеспечивает запись паспорта юзеру
     * @param passport - паспорт пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод обеспечивает получение (возвращаемое значчение)  Username
     * @return  - username Имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод обеспечивает запись имени пользовтеля.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * переопрееление equals (равнения) что бы можно было сравнивать
     * объект User. Для сравнения выбрана переменная passport
     * @param o - лобъект типа User
     * @return false или true (верно \ ложно)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     *переопределяем метод , что бы хэшкод объекта
     * User было passport
     * @return passport
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
