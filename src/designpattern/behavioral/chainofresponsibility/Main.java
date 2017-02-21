package designpattern.behavioral.chainofresponsibility;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * It helps building a chain of objects. Request enters from one end and keeps going from object to object till it finds the suitable handler.
     */
    public static void main(String[] args) {

        // Let's prepare a chain like below
        //      bank->paypal->bitcoin
        //
        // First priority bank
        //      If bank can't pay then paypal
        //      If paypal can't pay then bitcoin
        Bank bank = new Bank(100);
        Paypal paypal = new Paypal(200);
        Bitcoin bitcoin = new Bitcoin(300);

        bank.setNext(paypal);
        paypal.setNext(bitcoin);

        bank.pay(2590);
    }
}
