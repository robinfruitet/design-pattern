package designpattern.creational.abstractfactory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class WoodenFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExper() {
        return new Carpenter();
    }
}
