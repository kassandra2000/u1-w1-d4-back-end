package entities;

import enums.Department;

public class EmployeePartTime extends Employee {
    private final int days;
    private final int workingHours = 8;
    private final int overtimeHours;

    //costruttore
    public EmployeePartTime(int matriculate, double salary, Department department, String name, int days, int overtimeHours, double hours) {
        super(matriculate, salary, department, name, hours);
        this.days = days;
        this.overtimeHours = overtimeHours;
    }

    //metodi
    @Override
    public void calculateSalary() {
        double basicSalary = (this.getSalary() * this.workingHours) * this.days;
        double overtimePrice = this.overtimeHours * this.getSalary();
        double salary = basicSalary + overtimePrice;
        System.out.println("calcolo ad ore + extra");
        System.out.println("il salario di " + this.getName() + " è di: " + salary + " euro" + " e sono un impiegato part-time");
        System.out.println("il suo reparto è: " + this.getDepartment() + "\n");
    }

    @Override
    public double salary() {
        double basicSalary = (this.getSalary() * this.workingHours) * this.days;
        double overtimePrice = this.overtimeHours * this.getSalary();
        return basicSalary + overtimePrice;
    }


    //getter

    public int getDays() {
        return days;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }
}
