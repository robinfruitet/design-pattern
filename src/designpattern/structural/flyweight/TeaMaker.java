package designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * Created by rfruitet on 21/02/2017.
 */
public class TeaMaker {
    private static final HashMap<String, KarakTea> availableTea = new HashMap();

    public KarakTea make(String preference) {
        if (this.availableTea.get(preference) == null) {
            this.availableTea.put(preference, new KarakTea());
        }
        return this.availableTea.get(preference);
    }
}
