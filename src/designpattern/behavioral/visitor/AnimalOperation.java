package designpattern.behavioral.visitor;

/**
 * Created by rfruitet on 22/02/2017.
 */
public interface AnimalOperation {
    public void visitMonkey(Monkey monkey);
    public void visitLion(Lion lion);
    public void visitDolphin(Dolphin dolphin);
}
