package edu.iis.mto.time;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    (expected = OrderExpiredException.class)
    public void confirmOnExpiredOrderShouldThrowOrderExpiredException() {
        Order order = new Order(-90000);
        order.submit();
        order.confirm();
    }

    @Test
    public void confirmOrderShouldNotThrowOrderExpiredException() {
        Order order = new Order(0);
        order.submit();
        order.confirm();
    }
}