package designpattern.behavioral.command;

/**
 * Created by rfruitet on 21/02/2017.
 */
// Invoker
public class RemoteControl {

    public void submit(Command command) {
        command.execute();
    }
}
