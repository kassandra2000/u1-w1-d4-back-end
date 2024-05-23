package entities;

import enums.Department;

public class Volunteer extends Employee {


    //costruttore
    public Volunteer(Department department, String name, int year, String cv, double hours) {
        super(department, name, hours);
    }

    //metodi
    @Override
    public void calculateSalary() {
        System.out.println("il salario è: " + 0);
    }

    @Override
    public double salary() {
        return 0;
    }


}
