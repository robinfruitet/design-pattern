package designpattern.structural.bridge;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Bridge pattern is about preferring composition over inheritance. Implementation details
     * are pushed from a hierarchy to another object with a separate hierarchy.
     */
    public static void main(String[] args) {
        DarkTheme darkTheme = new DarkTheme();

        Home home = new Home(darkTheme);
        About about = new About(darkTheme);

        home.getContent();
        about.getContent();
    }
}
