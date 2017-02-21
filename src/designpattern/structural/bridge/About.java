package designpattern.structural.bridge;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class About implements WebPage {

    protected  Theme theme;

    public About(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void getContent() {
        System.out.println("About page in " + this.theme.getColor() + " theme");
    }
}

