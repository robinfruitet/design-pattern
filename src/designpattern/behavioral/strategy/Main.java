package designpattern.behavioral.strategy;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     * Consider the example of sorting, we implemented bubble sort but the data started to grow
     * and bubble sort started getting very slow. In order to tackle this we implemented Quick sort.
     * But now although the quick sort algorithm was doing better for large datasets, it
     * was very slow for smaller datasets. In order to handle this we implemented a strategy where
     * for small datasets, bubble sort will be used and for larger, quick sort.
     *
     * ----
     * Strategy pattern allows you to switch the algorithm or strategy based upon the situation.
     *
     * ----
     * In computer programming, the strategy pattern (also known as the policy pattern) is a behavioural
     * software design pattern that enables an algorithm's behavior to be selected at runtime.
     */
    public static void main(String[] args) {
        int[] array = {1,3,8,4,16};

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(array);

        sorter = new Sorter(new QuickSortStrategy());
        sorter.sort(array);
    }
}
