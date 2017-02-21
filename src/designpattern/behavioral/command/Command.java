package designpattern.behavioral.command;

/**
 * Created by rfruitet on 21/02/2017.
 */
public interface Command {
    public void execute();
    public void undo();
    public void redo();
}
