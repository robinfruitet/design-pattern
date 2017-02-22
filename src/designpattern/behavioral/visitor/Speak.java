package designpattern.behavioral.visitor;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class Speak implements AnimalOperation {

    @Override
    public void visitMonkey(Monkey monkey) {
        monkey.shout();
    }

    @Override
    public void visitLion(Lion lion) {
        lion.roar();
    }

    @Override
    public void visitDolphin(Dolphin dolphin) {
        dolphin.speak();
    }
}
