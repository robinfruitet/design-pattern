package designpattern.behavioral.visitor;

/**
 * Created by rfruitet on 22/02/2017.
 */
// Visiree
public interface Animal {
    public void accept(AnimalOperation operation);
}
