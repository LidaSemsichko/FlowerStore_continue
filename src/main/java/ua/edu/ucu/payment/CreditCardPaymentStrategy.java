package ua.edu.ucu.payment;

public class CreditCardPaymentStrategy implements Payment {
    public String pay(double price){
        StringBuilder str = new StringBuilder();
        str.append("Payed ");
        str.append(price);
        str.append(" with credit card");
        return str.toString();   
    }
}
