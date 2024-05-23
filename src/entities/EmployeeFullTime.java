package entities;

import enums.Department;

public class EmployeeFullTime extends Employee {
    private int overtimeHours;
    private double priceOfHours = 10.50;

    //costruttore
    public EmployeeFullTime(int matriculate, double salary, Department department, int overtimeHours, String name) {
        super(matriculate, salary, department, name);
        this.overtimeHours = overtimeHours;
    }

    //metodi
    @Override
    public void calculateSalary() {
        double overtimePrice = this.overtimeHours * priceOfHours;
        double sum = this.getSalary() + overtimePrice;
        System.out.println("\n calcolo stipendio fisso + extra");
        System.out.println("il salario di " + this.getName() + " è di: " +sum + " euro" + " e sono un impiegato full-time");
        System.out.println("il suo reparto è: " + this.getDepartment() + "\n");
    }

    @Override
    public double salary() {
        double overtimePrice = this.overtimeHours * priceOfHours;
        return this.getSalary() + overtimePrice;

    }

    //getter
    public int getOvertimeHours() {
        return overtimeHours;
    }

    public double getPriceOfHours() {
        return priceOfHours;
    }
}
