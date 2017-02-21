package designpattern.structural.flyweight;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * It is used to minimize memory usage or computational expenses by sharing as much as possible with similar objects.
     */
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        TeaShop teaShop = new TeaShop(teaMaker);


        teaShop.takeOrder("more sugar", 1);
        teaShop.takeOrder("less milk", 2);
        teaShop.takeOrder("without sugar", 5);

        teaShop.serve();
    }
}
