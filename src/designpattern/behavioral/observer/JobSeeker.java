package designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class JobSeeker implements Observer {

    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {

        JobPost jobPost = (JobPost) arg;
        System.out.println("Hi " + this.name + " ! New job posted : " + jobPost.getTitle());
    }
}
