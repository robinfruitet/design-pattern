package designpattern.structural.bridge;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Home implements WebPage {

    protected  Theme theme;

    public Home(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void getContent() {
        System.out.println("Home page in " + this.theme.getColor() + " theme");
    }
}

