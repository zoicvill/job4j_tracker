package ru.job4j.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountBillTest {

    @Test
    public void whenNotifyAccount() {
        List<Account> accountsList = List.of(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        );
        HashSet<Account> resultHash  = new HashSet<>(Set.of(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        ));
        assertThat(NotifyAccount.sendMail(accountsList), is(resultHash));
    }

    @Test
    public void whenAccountDuplicate() {
        List<Account> accountsList = List.of(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9"),
                new Account("142", "Viggo Mortinson", "qewd65sa9"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        );
        HashSet<Account> resultHash = new HashSet<>(Set.of(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        ));
        assertThat(NotifyAccount.sendMail(accountsList), is(resultHash));
    }

}