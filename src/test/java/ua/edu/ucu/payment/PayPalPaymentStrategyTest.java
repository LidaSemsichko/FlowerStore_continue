package ua.edu.ucu.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PayPalPaymentStrategyTest {
    
    @Test
    public void testPay() {
        PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        double price = 100.0;
        String expected = "Payed 100.0 with PayPal";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayZeroAmount() {
        PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        double price = 0.0;
        String expected = "Payed 0.0 with PayPal";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayNegativeAmount() {
        PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        double price = -50.0;
        String expected = "Payed -50.0 with PayPal";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }
}
