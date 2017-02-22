package designpattern.behavioral.visitor;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * Visitor pattern lets you add further operations to objects without having to modify them.
     * ----
     *
     * In object-oriented programming and software engineering, the visitor design pattern is
     * a way of separating an algorithm from an object structure on which it operates. A practical
     * result of this separation is the ability to add new operations to existing object structures
     * without modifying those structures. It is one way to follow the open/closed principle.
     */
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Lion lion = new Lion();
        Dolphin dolphin = new Dolphin();

        Speak speak = new Speak();
        Jump jump = new Jump();

        monkey.accept(speak);
        monkey.accept(jump);

        lion.accept(speak);
        lion.accept(jump);

        dolphin.accept(speak);
        dolphin.accept(jump);
    }
}
