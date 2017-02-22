package designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by rfruitet on 22/02/2017.
 */

// Iterator
public class StationList {
    protected ArrayList<RadioStation> stations = new ArrayList<>();

    public void addStation(RadioStation station) {
        this.stations.add(station);
    }

    public Iterator<RadioStation> iterator() {
        return new StationListIterator();
    }

    class StationListIterator implements Iterator<RadioStation> {

        protected int counter;

        @Override
        public boolean hasNext() {
            if (counter < stations.size())
                return true;
            return false;
        }

        @Override
        public RadioStation next() {
            RadioStation radioStation = stations.get(counter);
            counter++;
            return radioStation;
        }

        @Override
        public void remove() {
            stations.remove(--counter);
        }

        public int count() {
            return stations.size();
        }
    }
}
