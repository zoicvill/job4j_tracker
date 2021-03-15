package ru.job4j.bank;

import java.util.Objects;

/**
 * @author Jon
 * @version 1.0.0
 */
public class AccountBill {
    private String requisite;
    private double balance;

    public AccountBill(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountBill accountBill = (AccountBill) o;
        return Objects.equals(requisite, accountBill.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
