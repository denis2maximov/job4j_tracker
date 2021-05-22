package ru.job4j.bank;
import java.util.*;

/**
 * Класс описывает работу банковского сервиса. Обеспечивает хранение
 * пользователейи их аккаунтов, добавляет пользовтелей, добавляет аккаунты,
 * осществлеяет поиск по паспорту пользователя, поиск аккаунта пользователя
 * по реквизитам. Осуществляет перевод с одного аккаунта на другой по реквизитам.
 * @version 1.
 */
public class BankService {
    /**
     * хранение пользователей и их аккаунтов осуществляется в коллекции
     * вида HashMap. Аккаунты хранятся в коллекции ArrayList.
     */
    private Map<User, List<Account>> users = new HashMap<User, List<Account>>();

    /**
     * метод занимается добавление нового пользователя.
     * На вход принимается объект User. Добавляет пользователя, если
     * в коллекции нет такого пользователя (с таким ключем).
     * @param user - {@link User}
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет акаунт пользователю. Принимает на вход
     * паспорт и объект аккаунт {@link Account}.
     * Как работает: findByPassport ищет по паспорту пользователя.
     * И если находит, то проверяет есть ли у пользователя такой акаунт
     * и если нет, то добавляет в коллекцию ArrayList новый аккаунт.
     * @param passport - паспорт пользователя
     * @param account - счета пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountOut = users.get(user);
            if (!accountOut.contains(account)) {
                accountOut.add(account);
            }
        }
    }

    /**
     * Метод ищет по паспорту пользователя. На вход принимается
     * паспорт. Из колекции HashMap, где хранятся пользователи,
     * получает все отображения ключей (паспорт). И сравнивает их
     * с полученным на вход. Если находит, то прекращает работу и
     * отдает найденого по пспорту пользователя. Если не находит, то отдается
     * null.
     * @param passport - строковый параметр паспорт {@link User}.
     * @return User - объект юзер {@link User}
     */
    public User findByPassport(String passport) {
        User values = null;
        for (User exit : users.keySet()) {
            if (exit.getPassport().equals(passport)) {
                values = exit;
                break;
            }
        }
        return values;
    }

    /**
     * Метод ищет по реквизитам счет пользователя.
     * На вход принимает паспорт.
     * Сначали ищет пользователя по паспорту, потом (если находит)
     * ищет аккаунт у пользователя и сравнивает реквизиты у акаунта этого
     * пользователя с поступившими на вход.
     * @param passport {@link User}
     * @param requisite {@link User}
     * @return Account  {@link Account} - счет пользователя
     */

    public Account findByRequisite(String passport, String requisite) {
        Account value = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    value = account;
                    break;
                }
            }
        }
        return value;
    }

    /**
     * Метод осуществляет перевод с одного счета на другой.
     * На вход принимаются паспорт и реквизиты пользователя от кого идет
     * перечисление и паспорт и реквизиты пользователя, кому идет перечисление.
     * Так же приходит на вход сумма перевода
     * @param srcPassport - паспорт от кого переводим
     * @param srcRequisite - реквизиты счета пользователя от которого осуществляется
     *                     перевод
     * @param destPassport - пасорт пользователя, кому переводим.
     * @param destRequisite - реквизиты счета пользователя кому переводим.
     * @param amount - сумма перевода.
     * @return возвращаем - да \ нет .  Осуществлен перевод или нет.
     * Работа: находим аккаунты которые будут в работе (ищем по реквизитам и паспорту).
     * Если они не существуют, проверяем наличие суммы большей чем перевод на акааунте
     * пользователя от которого переводим. Если баланс больше или равен сумме перевода
     * ( amount ) , то осуществляем перевод: увеличиваем у того, кому переводим, уменьшаем
     * баланс у того от кого переводим. На выход отправляем true.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && destAcc != null) {
            if (srcAcc.getBalance() >= amount) {
                srcAcc.setBalance(srcAcc.getBalance() - amount);
                destAcc.setBalance(destAcc.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
