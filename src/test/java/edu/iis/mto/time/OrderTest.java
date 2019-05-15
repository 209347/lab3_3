package edu.iis.mto.time;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    (expected = OrderExpiredException.class)
    public void confirmOnExpiredOrderShouldThrowOrderExpiredException() {
        Order order = new Order();
        order.submit();
        order.confirm();
    }
}