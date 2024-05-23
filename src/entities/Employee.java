package entities;

import enums.Department;
import interfaces.CheckIn;

public abstract class Employee implements CheckIn {
    private int matriculate;
    private double salary;
    private final Department department;
    private final String name;
    private final double hours;

    //costruttore
    public Employee(Department department, String name, double hours) {
        this.department = department;
        this.name = name;
        this.hours = hours;
    }

    public Employee(int matriculate, double salary, Department department, String name, double hours) {
        this.matriculate = matriculate;
        this.salary = salary;
        this.department = department;
        this.name = name;
        this.hours = hours;
    }


    //metodo interfaccia
    @Override
    public void checkIn() {
        System.out.println("\n" + this.getDepartment());
        System.out.println(this.name + " inizia il suo turno alle ore: " + this.hours);
    }

    //metodi della classe
    public void printMatriculate() {
        System.out.println("il mio numero di matricola è: " + this.matriculate);
    }

    //metodi astratti

    public abstract void calculateSalary();

    public abstract double salary();

    //metodi statici
    public static void printMatriculate(Employee[] arrayOfEmployee) {
        for (Employee employee : arrayOfEmployee) {
            employee.printMatriculate();
        }
    }

    //getter e setter


    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }


}
