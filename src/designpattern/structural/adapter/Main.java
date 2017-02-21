package designpattern.structural.adapter;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Adapter pattern lets you wrap an otherwise incompatible object in an adapter to make it compatible with another class.
     */
    public static void main(String[] args) {
        WildDog wildDog = new WildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);

        //the hunter can hunt the wilddog thanks to the adapter
        Hunter hunter = new Hunter();
        hunter.hunt(wildDogAdapter);
    }
}
