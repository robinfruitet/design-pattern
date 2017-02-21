package designpattern.structural.composite;

import java.util.ArrayList;

/**
 * Created by rfruitet on 20/02/2017.
 */
public class Organization {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public float getNetSalary() {
        float netSalary = 0;
        for (Employee employee : this.employees) {
            netSalary += employee.getSalary();
        }
        return netSalary;
    }
}
