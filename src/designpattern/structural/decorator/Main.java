package designpattern.structural.decorator;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of a decorator class.
     */
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println( coffee.getDescription() + " : " + coffee.getCoast() + " €" );

        coffee = new VanillaCoffee(coffee);
        System.out.println( coffee.getDescription() + " : " + coffee.getCoast() + " €" );

        coffee = new MilkCoffee(coffee);
        System.out.println( coffee.getDescription() + " : " + coffee.getCoast() + " €" );
    }
}
