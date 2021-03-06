package designpattern.creational.prototype;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Sheep implements Cloneable {
    private String name;
    private String category;

    public Sheep(String name) {
        String  category = "Mountain Sheep";
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Object clone() {

        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
