package ru.job4j.bank;
import java.util.*;
public class BankService {
    private Map<User, List<Account>> users = new HashMap<User, List<Account>>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
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
                break;
            }
        }
        return values;
    }

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
