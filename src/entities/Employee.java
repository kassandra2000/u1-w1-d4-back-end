package entities;

import enums.Department;
import interfaces.CheckIn;

public abstract class Employee implements CheckIn {
    private int matriculate;
    private double salary;
    private Department department;
    private String name;
    private double hours;
    //costruttore
    public Employee(Department department, String name, double hours) {
        this.department = department;
        this.name = name;
        this.hours = hours;
    }

    public Employee(int matriculate, double salary, Department department, String name) {
        this.matriculate = matriculate;
        this.salary = salary;
        this.department = department;
        this.name = name;
    }


    //metodo interfaccia
    @Override
    public void checkIn() {
        System.out.println("\n" + "sono un: " + this.getDepartment());
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
        for (int i = 0; i < arrayOfEmployee.length; i++) {
            arrayOfEmployee[i].printMatriculate();
        }
    }

    //getter e setter

    public double getHours() {
        return hours;
    }

    public int getMatriculate() {
        return matriculate;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
