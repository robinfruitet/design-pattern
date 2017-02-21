package designpattern.creational.simplefactory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class WoodenDoor implements Door {

    private float width;
    private float height;

    public WoodenDoor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }
}
