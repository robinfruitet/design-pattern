package designpattern.behavioral.observer;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * Defines a dependency between objects so that whenever an object changes
     * its state, all its dependents are notified.
     * ---
     *
     * The observer pattern is a software design pattern in which an object,
     * called the subject, maintains a list of its dependents, called observers,
     * and notifies them automatically of any state changes, usually by calling
     * one of their methods.
     */
    public static void main(String[] args) {

        // Create subscribers
        JobSeeker john = new JobSeeker("John");
        JobSeeker anna = new JobSeeker("Anna");

        // add new subscriber to the publisher
        JobPostings jobPostings = new JobPostings();
        jobPostings.addJobSeekers(john);
        jobPostings.addJobSeekers(anna);

        // Add a new job post
        jobPostings.notify(new JobPost("Dev javascript"));

        // Output
        // Hi John ! New job posted : Dev javascript
        // Hi Anna ! New job posted : Dev javascript
    }
}
