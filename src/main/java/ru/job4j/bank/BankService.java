package ru.job4j.bank;

import java.util.*;

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
        var user = findByPassport(passport);
        if (user.isPresent() && !userListMap.get(user.get()).contains(accountBill)) {
            userListMap.get(user.get()).add(accountBill);
        }
    }

    /**
     * Метод ищет пользователя по паспорту.
     *
     * @param passport паспорт пользователя.
     * @return возвращает найденного пользователя.
     */

    public Optional<User> findByPassport(String passport) {
        var streamUser = userListMap.keySet().stream();
        return streamUser.filter(user ->
                user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет пользователя по паспорту и реквизитам счета.
     *
     * @param passport  данные паспорта
     * @param requisite банковские реквизиты
     * @return возвращает найденный счет по реквизитам.
     */

    public Optional<AccountBill> findByRequisite(String passport, String requisite) {
        var userOpt = findByPassport(passport);
        if (userOpt.isPresent()) {
            return userListMap.get(userOpt.get())
                    .stream()
                    .filter(accountBill ->
                            accountBill.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
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
        var srcAccount = findByRequisite(srcPassport, srcRequisite);
        var destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }

}
