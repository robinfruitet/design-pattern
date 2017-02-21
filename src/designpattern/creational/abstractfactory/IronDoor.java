package designpattern.creational.abstractfactory;


/**
 * Created by rfruitet on 20/02/2017.
 */
public class IronDoor implements Door {

    @Override
    public void getDescription() {
        System.out.println("I'm an iron door");
    }
}
