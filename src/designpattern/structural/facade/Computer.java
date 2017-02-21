package designpattern.structural.facade;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class Computer {
    public void getElectricShock() {
        System.out.println("Outch!");
    }

    public void makeSound() {
        System.out.println("Beep Beep!");
    }

    public void showLoadingScreen() {
        System.out.println("Loading..");
    }

    public void sooth() {
        System.out.println("Zzzzz");
    }

    public void closeEverything() {
        System.out.println("buzzzz!");
    }
}
