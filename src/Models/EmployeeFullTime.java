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
        return 0;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }

    @Override
    public double calculateIncentive() {
        return getSalary() + (getSalary()*0.5);
    }

    //test
}
