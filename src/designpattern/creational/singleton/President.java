package designpattern.creational.singleton;

/**
 * Created by rfruitet on 20/02/2017.
 */
public final class President {

    private static President instance = null;

    //Constructor private
    private President(){}

    public final static President getInstance() {
        if (President.instance == null) {
            President.instance = new President();
        }
        return President.instance;
    }
}
