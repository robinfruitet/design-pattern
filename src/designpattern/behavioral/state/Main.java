package designpattern.behavioral.state;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     *
     * Imagine you are using some drawing application, you choose the paint brush to draw.
     * Now the brush changes its behavior based on the selected color i.e. if you have
     * chosen red color it will draw in red, if blue then it will be in blue etc.
     *
     * ---
     * It lets you change the behavior of a class when the state changes.
     */
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new Default());
        editor.type("First Line");

        editor.setState(new UpperCase());
        editor.type("Second Line");

        editor.setState(new LowerCase());
        editor.type("Last Line. Bye!");
    }
}
