package designpattern.behavioral.mediator;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class User {

    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }
    public void send(String message) {
        this.chatMediator.showMessage(this, message);
    }
}
