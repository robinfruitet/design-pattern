package designpattern.structural.adapter;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class WildDogAdapter implements Lion {
    protected WildDog dog;

    public WildDogAdapter(WildDog dog) {
        this.dog = dog;
    }

    @Override
    public void roar() {
        this.dog.bark();
    }
}
