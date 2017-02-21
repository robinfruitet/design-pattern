package designpattern.creational.factory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Developer implements Interviewer {

    @Override
    public void askQuestion() {
        System.out.println("Asking technical question!");
    }
}
