package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citi){
        boolean rez = false;
        if (!citizens.containsKey(citi.getPassport())) {
            citizens.put(citi.getPassport(), citi);
            rez = true;
        }
        return rez;
    }

    public Citizen get(String passport) {
       return citizens.get(passport);

    }
}
