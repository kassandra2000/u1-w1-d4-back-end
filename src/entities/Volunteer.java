package entities;

import enums.Department;

public class Volunteer extends Employee {
    private int year;
    private String cv;


    //costruttore
    public Volunteer(Department department, String name, int year, String cv, double hours) {
        super(department, name, hours);
        this.year = year;
        this.cv = cv;


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
