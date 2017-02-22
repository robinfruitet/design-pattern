package designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class JobPostings extends Observable {

    private ArrayList<JobSeeker> jobSeekers = new ArrayList<>();

    public void addJobSeekers(JobSeeker jobSeeker) {
        this.jobSeekers.add(jobSeeker);
    }

    public void notify(JobPost jobPost) {
        for (JobSeeker jobSeeker: this.jobSeekers) {
            jobSeeker.update(this, jobPost);
        }
    }

}
