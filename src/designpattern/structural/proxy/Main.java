package designpattern.structural.proxy;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * A proxy, in its most general form, is a class functioning as an interface to something
     * else. A proxy is a wrapper or agent object that is being called by the client to access
     * the real serving object behind the scenes. Use of the proxy can simply be forwarding to
     * the real object, or can provide additional logic. In the proxy extra functionality can be provided,
     * for example caching when operations on the real object are resource intensive,
     * or checking preconditions before operations on the real object are invoked.
     */
    public static void main(String[] args) {
        Security door = new Security(new LabDoor());
        door.open("invalid");

        door.open("azerty");
        door.close();
    }
}
