package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest {

    @Test
    public void whenNotifyAccount() {
        List<Account> accountsList = Arrays.asList(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        );
        HashSet<Account> resultHash  = new HashSet<>(Arrays.asList(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        ));
        assertThat(NotifyAccount.sendMail(accountsList), is(resultHash ));
    }

    @Test
    public void whenAccountDuplicate() {
        List<Account> accountsList = Arrays.asList(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9"),
                new Account("142", "Viggo Mortinson", "qewd65sa9"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        );
        HashSet<Account> resultHash = new HashSet<>(Arrays.asList(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        ));
        assertThat(NotifyAccount.sendMail(accountsList), is(resultHash));
    }

}