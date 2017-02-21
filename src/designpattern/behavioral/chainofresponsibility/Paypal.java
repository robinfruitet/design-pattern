package designpattern.behavioral.chainofresponsibility;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class Paypal extends Account {
    protected float balance;

    public Paypal(float balance) {
        super(balance);
    }
}
