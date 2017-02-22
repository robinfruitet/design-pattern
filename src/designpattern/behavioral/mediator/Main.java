package designpattern.behavioral.mediator;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * Mediator pattern adds a third party object (called mediator) to control the interaction
     * between two objects (called colleagues). It helps reduce the coupling between the classes
     * communicating with each other. Because now they don't need to have the knowledge of each
     * other's implementation.
     * ---
     * In software engineering, the mediator pattern defines an object that encapsulates how a set of objects interact. This pattern is considered to be a behavioral pattern due to the way it can alter the program's running behavior.
     */
    public static void main(String[] args) {

        ChatMediator mediator = new ChatRoom();

        User john = new User("John", mediator);
        User anna = new User("Anna", mediator);

        john.send("Hello there!");
        anna.send("Hey!");
    }
}
