package designpattern.creational.abstractfactory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Carpenter implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("I can only fit wooden door");
    }
}
