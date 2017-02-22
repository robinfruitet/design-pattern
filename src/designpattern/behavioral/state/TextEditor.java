package designpattern.behavioral.state;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class TextEditor {
    private WritingState state;

    public TextEditor(WritingState state) {
        this.state = state;
    }

    public void setState(WritingState state) {
        this.state = state;
    }

    public void type(String word) {
        this.state.write(word);
    }
}
