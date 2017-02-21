package designpattern.creational.builder;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class BurgerBuilder {
    public int size;
    public boolean cheese = false;
    public boolean pepperoni = false;
    public boolean lettuce = false;
    public boolean tomato = false;

    public BurgerBuilder(int size) {
        this.size = size;
    }

    public BurgerBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public BurgerBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public BurgerBuilder addLettuce() {
        this.cheese = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public Burger build() {
        return new Burger(this);
    }
}
