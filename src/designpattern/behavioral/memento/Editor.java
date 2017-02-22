package designpattern.behavioral.memento;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class Editor {
    private String content = "";

    public void type(String words) {
        this.content = this.content + " " + words;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }
}
