package designpattern.creational.factory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public abstract class HiringManager {

    // Factory method
    abstract public Interviewer makeInterviewer();

    public void takeInterview() {
        makeInterviewer().askQuestion();
    }
}
