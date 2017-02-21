package designpattern.creational.factory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class DevelopementManager extends HiringManager {
    @Override
    public Interviewer makeInterviewer() {
        return new Developer();
    }
}
