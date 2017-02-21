package designpattern.creational.prototype;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Create object based on an existing object through cloning.
     * ---
     * When an object is required that is similar to existing object or
     * when the creation would be expensive as compared to cloning.
     */
    public static void main(String[] args) {
        Sheep original = new Sheep("Jolly");
        System.out.println(original.getName());

        //Clone
        Sheep cloned = (Sheep) original.clone();

        cloned.setName("Dolly");
        System.out.println(cloned.getName());
    }
}
