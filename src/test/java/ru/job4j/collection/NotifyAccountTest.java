package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest {

    @Test
    public void NotifyAccount() {
        List<Account> list = Arrays.asList(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        );
        HashSet<Account> hashSet = new HashSet<>(Arrays.asList(
                new Account("123", "Viggo Mortinson", "ds54fs6awq"),
                new Account("142", "Viggo Mortinson", "qewd65sa9")
        ));
        assertThat(NotifyAccount.sendMail(list), is(hashSet));
    }
}