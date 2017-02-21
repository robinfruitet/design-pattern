package designpattern.structural.decorator;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class MilkCoffee implements Coffee {
    protected Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public float getCoast() {
        return this.coffee.getCoast() + 2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }
}
