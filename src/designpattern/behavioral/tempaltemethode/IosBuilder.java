package designpattern.behavioral.tempaltemethode;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class IosBuilder extends Builder {

    @Override
    public void test() {
        System.out.println("Running ios test");
    }

    @Override
    public void lint() {
        System.out.println("Lint the ios code");
    }

    @Override
    public void deploy() {
        System.out.println("Assembling the ios build");
    }

    @Override
    public void assemble() {
        System.out.println("Deploying ios build to server");
    }
}
