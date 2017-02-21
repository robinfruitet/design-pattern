package designpattern.creational.simplefactory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Simple factory simply generates an instance for client without exposing any instantiation logic to the client
     * ---
     * When creating an object is not just a few assignments and involves some logic,
     * it makes sense to put it in a dedicated factory instead of repeating the same code everywhere.
     */
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100, 200);
        System.out.println("Width : " + door.getWidth());
        System.out.println("Height : " + door.getHeight());
    }
}
