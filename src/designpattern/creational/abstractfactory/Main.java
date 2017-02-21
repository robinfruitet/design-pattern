package designpattern.creational.abstractfactory;


/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * A factory of factories; a factory that groups the individual but related/dependent
     * factories together without specifying their concrete classes.
     * ---
     * When there are interrelated dependencies with not-that-simple creation logic involved
     */
    public static void main(String[] args) {

        WoodenFactory woodenFactory = new WoodenFactory();

        Door door = woodenFactory.makeDoor();
        DoorFittingExpert doorFittingExpert = woodenFactory.makeFittingExper();

        door.getDescription();
        doorFittingExpert.getDescription();

        System.out.println("------");

        IronFactory ironFactory = new IronFactory();

        door = ironFactory.makeDoor();
        doorFittingExpert = ironFactory.makeFittingExper();

        door.getDescription();
        doorFittingExpert.getDescription();
    }
}
