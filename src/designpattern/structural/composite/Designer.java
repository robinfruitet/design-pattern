package designpattern.structural.composite;

import java.util.Arrays;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Designer implements Employee {
    private String name;
    private float salary;
    private Arrays roles;

    public Designer(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public Arrays getRole() {
        return this.roles;
    }
}
