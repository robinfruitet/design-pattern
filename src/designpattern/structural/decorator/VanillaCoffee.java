package designpattern.structural.decorator;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class VanillaCoffee implements Coffee {
    protected Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public float getCoast() {
        return this.coffee.getCoast() + 3;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", vanilla";
    }
}
