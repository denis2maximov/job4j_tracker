package ru.job4j.bank;
import java.util.*;
public class BankService {
    private Map<User, List<Account>> users = new HashMap<User, List<Account>>();

    public void addUser(User user) {
        if (!users.containsKey(user.getPassport())) {
            // users.put(user, new ArrayList<Account>());
            users.putIfAbsent(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountOut = users.get(user);
                if (!accountOut.contains(account)) {
                    accountOut.add(account);
                }
            }
        }


    public User findByPassport(String passport) {
        User values = null;
        for (User exit : users.keySet()) {
            if (exit.getPassport().equals(passport)) {
                values = exit;
            }
        }
        return values;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account value = null;
        User user = findByPassport(passport);
       if (user != null) {
          //  List<Account> acc = new ArrayList<Account>(users.get(user));
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    value = account;
                }
            }
        }
        return value;
    }


    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
            /** Найти пользователя от кого перевод, проверить, что он есть. Найти аккаунт, проверить,
             * что он существует (по srcRequisite). Звпросить баланс аккаутна (srcRequisite),
             * проверить, что он больше или равен сумме перевода (double amount). Если хоть что-то не
             * найдено - false.
             * Найти и проверить на существование пользователя кому перевод, проверить существование
             * реквизитов у пользователя кому переводим.
             * Перевод. Присваиваем новые значения полю balance первого и второго user.
             */
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        if (srcUser != null && destUser != null) {
            ArrayList<Account> accSrcUser = new ArrayList<Account>(users.get(srcUser));
             for (Account acc1User : accSrcUser) {
                if (acc1User.getRequisite().equals(srcRequisite)) {
                    if (acc1User.getBalance() >= amount) {
                        acc1User.setBalance(acc1User.getBalance() - amount);
                    }
                }
            }
            ArrayList<Account> accDestUser = new ArrayList<Account>(users.get(destUser));
            for (Account acc2User : accDestUser) {
                if (acc2User.getRequisite().equals(destRequisite)) {
                     acc2User.setBalance(acc2User.getBalance() + amount);
                    }
                }
                    rsl = true;
            }
                    return rsl;
        }
      }
