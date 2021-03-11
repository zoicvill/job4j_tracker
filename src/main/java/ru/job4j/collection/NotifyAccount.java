package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sendMail(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account : accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}
