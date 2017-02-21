package designpattern.behavioral.command;

/**
 * Created by rfruitet on 21/02/2017.
 */
// Receiver
public class Bulb {
    public void turnOn() {
        System.out.println("Bulb has been lit");
    }

    public void turnOff() {
        System.out.println("Hello darkness my old friend");
    }
}
