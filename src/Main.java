import entities.*;
import enums.Department;

public class Main {
    public static void main(String[] args) {
// -------------------------------------------- esercizio 1-----------------------
//        Employee employee1 = new Employee(23344, 1.200, Department.produzione);
//        Employee employee2 = new Employee(47892, 1.500, Department.vendite);
//        Employee employee3 = new Employee(74387, 2.200, Department.amministrazione);
//        Employee[] arrayOfEmployee = {employee1, employee2, employee3};
//        printMatriculate(arrayOfEmployee);

// -------------------------------------------- esercizio 2-----------------------
        EmployeeFullTime employeeFullTime1 = new EmployeeFullTime(13234, 1200, Department.produzione, 5, "Edoardo", 15.00);
        employeeFullTime1.calculateSalary();

        EmployeePartTime employeePartTime1 = new EmployeePartTime(56778, 8.5, Department.vendite, "Augusto", 15, 37, 12.00);
        employeePartTime1.calculateSalary();

        Manager manager1 = new Manager(13234, 3500, Department.amministrazione, 2, "Alexander", 7.30);
        manager1.calculateSalary();

        Employee[] arrayOfEmployee = {employeeFullTime1, employeePartTime1, manager1};
        printSalary(arrayOfEmployee);

// -------------------------------------------- esercizio 3-----------------------
        Volunteer volunteer1 = new Volunteer( Department.volontario, "Germano", 54, "www.curriculum.com", 10.30);
        Employee[] arrayOfEmployeeAndVolunteer = {employeeFullTime1, employeePartTime1, manager1, volunteer1};
        printCheckIn(arrayOfEmployeeAndVolunteer);
    }

    public static void printSalary(Employee[] arrayOfEmployee) {
        double sum = 0;
        for (Employee employee : arrayOfEmployee) {sum += employee.salary();}
//       for (int i = 0; i < arrayOfEmployee.length; i++) {sum += arrayOfEmployee[i].salary();}
        System.out.println("la somma degi stipendi è di: " + sum + " euro");
    }

    public static void printCheckIn(Employee[] arrayOfEmployeeAndVolunteer) {
        System.out.println("\n esercizio 3");
        for (Employee employee : arrayOfEmployeeAndVolunteer) {
            employee.checkIn();
        }
    }
};