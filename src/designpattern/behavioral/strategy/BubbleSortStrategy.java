package designpattern.behavioral.strategy;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class BubbleSortStrategy implements SortStrategy {
    @Override
    public int[] sort(int[] dataset) {

        System.out.println("Using bubble sort");

        // Do sort
        return dataset;
    }
}
