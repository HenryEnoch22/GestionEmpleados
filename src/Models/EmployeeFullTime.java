package Models;

import Interfaces.IEmployee;

public class EmployeeFullTime extends Employee implements IEmployee {
    private int hoursWorked;

    EmployeeFullTime() {}

    public EmployeeFullTime(int ID, String name, double salario, int hoursWorked) {
        super(ID, name, salario);
        this.hoursWorked = hoursWorked;
    }

    public double calculateMonthSalary(){
        return getSalary()*hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getSalary()*hoursWorked;
    }

    @Override
    public double calculateIncentive() {
        return getSalary()*0.5;
    }

}
