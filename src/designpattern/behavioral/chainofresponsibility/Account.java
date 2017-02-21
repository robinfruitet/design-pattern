package designpattern.behavioral.chainofresponsibility;

/**
 * Created by rfruitet on 21/02/2017.
 */
public abstract class Account {
    protected  Account successor;
    protected float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public void setNext(Account account) {
        this.successor = account;
    }

    public void pay(float amoutToPay) {
        try {
            if (this.canPay(amoutToPay)) {
                System.out.printf("Paid %s using %s\n", amoutToPay, getClass().getSimpleName());
            } else if (this.successor == null) {
                throw new MyException();
            }
            else {
                System.out.printf("Cannot pay using %s. Proceeding...\n", getClass().getSimpleName());
                this.successor.pay(amoutToPay);
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public boolean canPay(float amoutToPay) {
        return balance >= amoutToPay;
    }

    public class MyException extends Throwable {
        public MyException(String test) {
        }

        public MyException() {
        }

        @Override
        public String getMessage() {
            return "None of the account have enough balance ";
        }
    }
}
