package designpattern.structural.proxy;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class Security {
    protected Door door;

    public Security(Door door) {
        this.door = door;
    }

    public void open(String password) {
        if (this.authenticate(password).compareTo(password) == 0)
            this.door.open();
        else
            System.out.println("Wrong password");
    }

    public String authenticate(String password) {
        return "azerty";
    }

    public void close() {
        this.door.close();
    }
}
