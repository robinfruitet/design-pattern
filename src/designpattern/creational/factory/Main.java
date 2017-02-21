package designpattern.creational.factory;



/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * It provides a way to delegate the instantiation logic to child classes.
     * ---
     * Useful when there is some generic processing in a class but the required sub-class is dynamically decided at runtime.
     * Or putting it in other words, when the client doesn't know what exact sub-class it might need.
     */
    public static void main(String[] args) {
        DevelopementManager developementManager = new DevelopementManager();
        developementManager.takeInterview();

        CommunityManager communityManager = new CommunityManager();
        communityManager.takeInterview();
    }
}
