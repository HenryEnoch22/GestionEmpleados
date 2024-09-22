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
        return getSalary() * hoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return getSalary() * hoursPerWeek;
    }
    @Override
    public double calculateIncentive() {
        return getSalary()*0.3;
    }

}
