package designpattern.behavioral.visitor;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class Dolphin implements Animal {

    public void speak() {
        System.out.println("Hii hihihih!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitDolphin(this);
    }
}
