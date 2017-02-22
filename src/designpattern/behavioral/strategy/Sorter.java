package designpattern.behavioral.strategy;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class Sorter {
    protected SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] dataset) {
        return sortStrategy.sort(dataset);
    }
}
