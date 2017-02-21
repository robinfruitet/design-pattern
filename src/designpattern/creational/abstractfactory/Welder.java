package designpattern.creational.abstractfactory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Welder implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("I can only fit iron door");
    }
}
