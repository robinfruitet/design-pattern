package designpattern.behavioral.tempaltemethode;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class AndroidBuilder extends Builder {

    @Override
    public void test() {
        System.out.println("Running android test");
    }

    @Override
    public void lint() {
        System.out.println("Lint the android code");
    }

    @Override
    public void deploy() {
        System.out.println("Assembling the android build");
    }

    @Override
    public void assemble() {
        System.out.println("Deploying android build to server");
    }
}
