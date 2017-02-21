package designpattern.behavioral.command;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * Real world example
     * A generic example would be you ordering a food at restaurant. You (i.e. Client)
     * ask the waiter (i.e. Invoker) to bring some food (i.e. Command) and waiter simply
     * forwards the request to Chef (i.e. Receiver) who has the knowledge of what and how to
     * cook. Another example would be you (i.e. Client) switching on (i.e. Command) the television
     * (i.e. Receiver) using a remote control (Invoker).
     *
     * ---
     * Allows you to encapsulate actions in objects. The key idea behind this pattern is
     * to provide the means to decouple client from receiver.
     *
     * ---
     * Command pattern can also be used to implement a transaction based system.
     * Where you keep maintaining the history of commands as soon as you execute them.
     * If the final command is successfully executed, all good otherwise just iterate
     * through the history and keep executing the undo on all the executed commands
     */
    public static void main(String[] args) {

        Bulb bulb = new Bulb();

        TurnOn turnOn = new TurnOn(bulb);
        TurnOff turnOff = new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.submit(turnOn);
        remoteControl.submit(turnOff);
    }
}
