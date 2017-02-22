package designpattern.behavioral.memento;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * Memento pattern is about capturing and storing the current state of an object
     * in a manner that it can be restored later on in a smooth manner.
     */
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.type("This is the first sentence.");
        editor.type("And this is the second.");

        EditorMemento save = editor.save();

        editor.type("A third sentence.");

        System.out.println(editor.getContent());

        editor.restore(save);

        System.out.println(editor.getContent());
    }
}
