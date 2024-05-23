package entities;

import enums.Department;

public class Manager extends Employee {
    private final int overtimeHours;
    private final double priceOfHours = 28.50;

    //costruttore
    public Manager(int matriculate, double salary, Department department, int overtimeHours, String name,double hours) {
        super(matriculate, salary, department, name,hours);
        this.overtimeHours = overtimeHours;

    }

    //metodi
    @Override
    public void calculateSalary() {
        double overtimePrice = this.overtimeHours * priceOfHours;
        double sum = this.getSalary() + overtimePrice;
        System.out.println("calcolo stipendio fisso + extra");
        System.out.println("il salario di " + this.getName() + " è di: " + sum + " euro" + " e sono un menager");
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
