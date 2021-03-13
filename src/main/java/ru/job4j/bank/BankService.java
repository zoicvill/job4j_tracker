package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<AccountBill>> userListMap = new HashMap<>();

    public void addUser(User user) {
        userListMap.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, AccountBill accountBill) {
        User user = findByPassport(passport);
        if (user != null && !userListMap.get(user).contains(accountBill)) {
            userListMap.get(user).add(accountBill);
        }
    }

    public User findByPassport(String passport) {
        for (User user : userListMap.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public AccountBill findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<AccountBill> bill = userListMap.get(user);
            for (AccountBill accountBill : bill) {
                if (accountBill.getRequisite().equals(requisite)) {
                    return accountBill;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        double buf = 0.0;
        AccountBill srcAccount = findByRequisite(srcPassport, srcRequisite);
        AccountBill destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }

}
