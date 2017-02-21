package designpattern.structural.proxy;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class LabDoor implements Door {
    @Override
    public void open() {
        System.out.println("Opening lab door");
    }

    @Override
    public void close() {
        System.out.println("Closing lab door");
    }
}
