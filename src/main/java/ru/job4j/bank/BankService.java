package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Банковский сервис по переводу денежных средств.
 */
public class BankService {
    private final Map<User, List<AccountBill>> userListMap = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * Метод принимает два параметра: пользователя и список счетов.
     *
     * @param user пользователь которого добавляем.
     */

    public void addUser(User user) {
        userListMap.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод ищет пользователя по паспорту, затем получаем список его счетов.
     * Метод добавляет новый счет к пользователю.
     *
     * @param passport    по паспорту ищем пользователя.
     * @param accountBill получаем список счетов.
     */

    public void addAccount(String passport, AccountBill accountBill) {
        User user = findByPassport(passport);
        if (user != null && !userListMap.get(user).contains(accountBill)) {
            userListMap.get(user).add(accountBill);
        }
    }

    /**
     * Метод ищет пользователя по паспорту.
     *
     * @param passport паспорт пользователя.
     * @return возвращает найденного пользователя.
     */

    public User findByPassport(String passport) {
        for (User user : userListMap.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет пользователя по паспорту и реквизитам счета.
     *
     * @param passport  данные паспорта
     * @param requisite банковские реквизиты
     * @return возвращает найденный счет по реквизитам.
     */

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

    /**
     * Метод реализует перечисление денег с одного счета на другой.
     *
     * @param srcPassport   паспорт пользователя который перечисляет денежные средства
     * @param srcRequisite  реквизиты пользователя который перечисляет денежные средства
     * @param destPassport  паспорт пользователя который получает денежные средства
     * @param destRequisite реквизиты на которые перечисляются денежные средства
     * @param amount        сумма перевода.
     * @return если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят),
     * то метод должен вернуть false
     */

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
