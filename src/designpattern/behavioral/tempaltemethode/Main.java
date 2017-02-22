package designpattern.behavioral.tempaltemethode;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * Template method defines the skeleton of how a certain algorithm could be performed,
     * but defers the implementation of those steps to the children classes.
     *
     * ---
     * In software engineering, the template method pattern is a behavioral design pattern
     * that defines the program skeleton of an algorithm in an operation, deferring some steps
     * to subclasses. It lets one redefine certain steps of an algorithm without changing
     * the algorithm's structure.
     */
    public static void main(String[] args) {
        AndroidBuilder androidBuilder = new AndroidBuilder();
        androidBuilder.build();

        IosBuilder iosBuilder = new IosBuilder();
        iosBuilder.build();
    }
}
