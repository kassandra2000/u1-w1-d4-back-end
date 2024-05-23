package entities;

import enums.Department;

public class Volunteer extends Employee {
    private int year;
    private String cv;
    private double hours;

    //costruttore
    public Volunteer(int matriculate, double salary, Department department, String name, int year, String cv, double hours) {
        super(matriculate, salary, department, name);
        this.year = year;
        this.cv = cv;
        this.hours = hours;

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


    @Override
    public void checkIn() {
        System.out.println("\n" + "sono un: " + this.getDepartment());
        System.out.println(this.getName() + " inizia il suo turno alle ore: " + this.hours);
    }
}
