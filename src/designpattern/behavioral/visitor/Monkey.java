package designpattern.behavioral.visitor;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class Monkey implements Animal {

    public void shout() {
        System.out.println("Ooh ooh oo!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitMonkey(this);
    }
}
