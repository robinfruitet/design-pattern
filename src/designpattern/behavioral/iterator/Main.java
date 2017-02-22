package designpattern.behavioral.iterator;

import java.util.Iterator;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {

    /**
     */
    public static void main(String[] args) {
        StationList stationList = new StationList();

        stationList.addStation(new RadioStation(92));
        stationList.addStation(new RadioStation(101));
        stationList.addStation(new RadioStation(103));
        stationList.addStation(new RadioStation(108));

        Iterator<RadioStation> iterator = stationList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getFrequency());
        }
    }
}
