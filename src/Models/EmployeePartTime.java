package Models;

import Interfaces.IEmployee;

public class EmployeePartTime extends Employee implements IEmployee {
    private int hoursPerWeek;

    public EmployeePartTime() {}

    public EmployeePartTime(int ID, String name, double salary, int hoursPerWeek) {
        super(ID, name, salary);
        this.hoursPerWeek = hoursPerWeek;
    }

    public double calculateWeekSalary(){
        return 0;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }
    @Override
    public double calculateIncentive() {
        return getSalary() + (getSalary()*0.3);
    }

}
