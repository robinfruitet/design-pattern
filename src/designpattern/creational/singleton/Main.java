package designpattern.creational.singleton;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Ensures that only one object of a particular class is ever created.
     */
    public static void main(String[] args) {

        President president1 = President.getInstance();

        President president2 = President.getInstance();

        if (president1 == president2)
            System.out.println("Only one instance");
    }
}
