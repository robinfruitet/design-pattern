package designpattern.creational.builder;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Allows you to create different flavors of an object while avoiding constructor pollution.
     * Useful when there could be several flavors of an object. Or when there are a lot of steps involved in creation of an object.
     * ---
     * When there could be several flavors of an object and to avoid the constructor telescoping.
     * The key difference from the factory pattern is that; factory pattern is to be used when
     * the creation is a one step process while builder pattern is to be used when the creation is a multi step process.
     */
    public static void main(String[] args) {

        System.out.println("Burger without lettuce");
        Burger burger = (new BurgerBuilder(14))
                .addCheese()
                .addPepperoni()
                .addTomato()
                .build();

        System.out.println(burger.toString());
    }
}
