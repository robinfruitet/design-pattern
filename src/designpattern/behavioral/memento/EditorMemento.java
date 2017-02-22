package designpattern.behavioral.memento;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class EditorMemento {
    private String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
