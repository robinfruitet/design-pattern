package designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class TeaShop {
    protected HashMap<Integer, KarakTea> orders = new HashMap<>();
    protected TeaMaker teaMaker;

    public TeaShop(TeaMaker teaMaker) {
        this.teaMaker = teaMaker;
    }

    public void takeOrder(String teaType, int table) {
        KarakTea tea = this.teaMaker.make(teaType);
        this.orders.put(table, tea);
    }

    public void serve() {

        Iterator i = orders.keySet().iterator();

        while (i.hasNext()) {
            int table = (int) i.next();
            System.out.println("Serving tea to the table# " + table);
        }
    }
}
