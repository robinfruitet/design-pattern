package designpattern.behavioral.state;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class UpperCase implements WritingState {
    @Override
    public void write(String word) {
        System.out.println(word.toUpperCase());
    }
}
