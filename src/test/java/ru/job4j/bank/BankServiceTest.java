package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BankServiceTest {

    @Test
    public void addUser() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434").get(), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new AccountBill("5546", 150D));
        assertThat(bank.findByRequisite("34", "5546"), is(Optional.empty()));
    }

    @Test
    public void addAccount() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new AccountBill("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(),
                is(150D));
    }
    @Test
    public void findByRequisiteFail() {
        var user = new User("3434", "Petr Arsentev");
        var bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new AccountBill("5546", 150D));
        assertThat(bank.findByRequisite("334", "556"), is(Optional.empty()));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new AccountBill("5546", 150D));
        bank.addAccount(user.getPassport(), new AccountBill("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").get().getBalance(), is(200D));
    }

    @Test
    public void transferMoneyFail() {
        User user = new User("11220","John Konstantin");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new AccountBill("1234",-1000.0));
        bank.addAccount(user.getPassport(), new AccountBill("12",10.0));
        boolean b = bank.transferMoney(user.getPassport(), "1234", user.getPassport(), "12",1500.0);
        assertThat(b,is(false));
    }
}