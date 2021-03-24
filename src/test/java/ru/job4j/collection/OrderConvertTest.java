package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OrderConvertTest {

    @Test
    public void whenConvertTest() {
        List<Order> list = List.of(new Order("0990", "iuiuiu"),
                new Order("090", "idfdfu"));
        HashMap<String, Order> map = OrderConvert.mapProcess(list);
        assertThat(map.get("0990"), is(new Order("0990", "iuiuiu")));

    }

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.mapProcess(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

}