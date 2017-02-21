package designpattern.structural.decorator;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public float getCoast() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
