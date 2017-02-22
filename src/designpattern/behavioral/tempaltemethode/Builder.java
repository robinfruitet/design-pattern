package designpattern.behavioral.tempaltemethode;

/**
 * Created by rfruitet on 22/02/2017.
 */
public abstract class Builder {

    // Tempalte Methode
    public void build() {
        this.test();
        this.lint();
        this.assemble();
        this.deploy();
    }

    public abstract void assemble();

    public abstract void deploy();

    public abstract void lint();

    public abstract void test();
}
