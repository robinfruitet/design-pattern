package designpattern.behavioral.visitor;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class Lion implements Animal {

    public void roar() {
        System.out.println("Graou");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);
    }
}
