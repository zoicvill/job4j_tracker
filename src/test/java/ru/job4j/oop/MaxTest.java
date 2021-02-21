package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest{

    @Test
    public void whenMaxTestTwo(){
        int res = Max.max(1,2);
        assertThat(res,is(2));

    }
    @Test
    public void whenMaxTestThree(){
        int res = Max.max(45,2, 8 );
        assertThat(res,is(45));

    }  @Test
    public void whenMaxTestThree1(){
        int res = Max.max(45,25, 84 );
        assertThat(res,is(84));

    }

    @Test
    public void whenMaxTestFour(){
        int res = Max.max(343,232,567,1);
        assertThat(res,is(567));

    }


}