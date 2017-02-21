package designpattern.structural.facade;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class ComputerFacade {

    protected Computer computer;

    public ComputerFacade(Computer computer) {
        this.computer = computer;
    }

    public void turnOn() {
        this.computer.getElectricShock();
        this.computer.makeSound();
        this.computer.showLoadingScreen();
    }

    public void turnOff() {
        this.computer.closeEverything();
        this.computer.sooth();
    }
}
