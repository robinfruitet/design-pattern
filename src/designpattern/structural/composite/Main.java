package designpattern.structural.composite;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Main {


    /**
     * Composite pattern lets clients to treat the individual objects in a uniform manner.
     */
    public static void main(String[] args) {
        Developer anna = new Developer("Anna", 42000);
        Designer john = new Designer("John", 36000);

        Organization organization = new Organization();
        organization.addEmployee(anna);
        organization.addEmployee(john);

        System.out.println("Net salary of the organization : " + organization.getNetSalary() + " €");
    }
}
