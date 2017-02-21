package designpattern.behavioral.command;

/**
 * Created by rfruitet on 21/02/2017.
 */
// Command
public class TurnOff implements Command {
    protected Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOff();
    }

    @Override
    public void undo() {
        this.bulb.turnOn();
    }

    @Override
    public void redo() {
        this.execute();
    }
}
