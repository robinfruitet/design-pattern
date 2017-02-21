package designpattern.creational.factory;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class CommunityManager extends HiringManager {
    @Override
    public Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
