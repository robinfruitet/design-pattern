package designpattern.creational.factory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestion() {
        System.out.println("Asking community question.");
    }
}
