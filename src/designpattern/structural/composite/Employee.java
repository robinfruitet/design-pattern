package designpattern.structural.composite;

import java.util.Arrays;

/**
 * Created by rfruitet on 20/02/2017.
 */
public interface Employee {
    public String getName();
    public void setSalary(float salary);
    public float getSalary();
    public Arrays getRole();
}
