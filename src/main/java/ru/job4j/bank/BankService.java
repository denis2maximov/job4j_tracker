package ru.job4j.bank;

import java.util.*;

public class BankService {
    private HashMap<User, List<Account>> users = new HashMap<User, List<Account>>();

    public void addUser(User user) {
        if (!users.containsKey(user.getPassport())) {
            //  users.put(user, new ArrayList<Account>());
            users.putIfAbsent(user, new ArrayList<Account>());
        }
    }

  /*  public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        users.put(user, new ArrayList<Account>(account.getRequisite(), account.getBalance());
    } */

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
    /*    Account values = null;
        User user = findByPassport(passport);
        ArrayList account = users.get(user);
        for (Account x  : account ) {
            if (x.equals(requisite)) {
                values.getRequisite();
        } */
       List<Account> out = new ArrayList<Account>();
        Account values = null;
        User user = findByPassport(passport);
        out = users.get(user);
        for (Account x : out) {
            if (x.getRequisite().equals(requisite)) {
                values = x;
            }

        }
        return values;
    }



        

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}