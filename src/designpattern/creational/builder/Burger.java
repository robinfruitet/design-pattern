package designpattern.creational.builder;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Burger {
    private int size;
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean lettuce = false;
    private boolean tomato = false;

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }
}
