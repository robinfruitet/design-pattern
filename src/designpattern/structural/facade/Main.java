package designpattern.structural.facade;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Facade pattern provides a simplified interface to a complex subsystem.
     */
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(new Computer());
        computer.turnOn();
        computer.turnOff();
    }
}
