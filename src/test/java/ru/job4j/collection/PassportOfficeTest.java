package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void whenPassportsTest(){
        Citizen citizen = new Citizen("43434","John J");
        PassportOffice pass = new PassportOffice();
        pass.add(citizen);
        assertThat(pass.get(citizen.getPassport()),is(citizen));
    }
    @Test
    public void whenPassportsTestDoubles(){
        Citizen citizen = new Citizen("43434","John J");
        Citizen doubles = new Citizen("43434","John J");
        PassportOffice pass = new PassportOffice();
        pass.add(citizen);
        pass.add(doubles);
        assertThat(pass.get(citizen.getPassport()),is(citizen));
    }

}