package ua.edu.ucu.payment;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    Payment paymentType;
    public PaymentController(){
        paymentType = new PayPalPaymentStrategy();
    }

    @GetMapping("/payment")
    public String deliveryInfo(){
        Random rand = new Random();
        return paymentType.pay(rand.nextDouble(10000));
    }
}
