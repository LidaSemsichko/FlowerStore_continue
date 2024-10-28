package ua.edu.ucu.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardPaymentStrategyTest {
    
    @Test
    public void testPay() {
        CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
        double price = 100.0;
        String expected = "Payed 100.0 with credit card";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayZero() {
        CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
        double price = 0.0;
        String expected = "Payed 0.0 with credit card";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPayNegative() {
        CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
        double price = -50.0;
        String expected = "Payed -50.0 with credit card";
        String actual = paymentStrategy.pay(price);
        assertEquals(expected, actual);
    }
}
