package designpattern.creational.abstractfactory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class IronFactory implements DoorFactory {

    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExper() {
        return new Welder();
    }
}
