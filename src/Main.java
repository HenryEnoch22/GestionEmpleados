import Models.EmployeeFullTime;
import Models.EmployeePartTime;

public class Main {
    public static void main(String[] args) {
        EmployeeFullTime employee1 = new EmployeeFullTime(1, "Julian", 160, 8 );
        EmployeePartTime employee2 = new EmployeePartTime(2, "Sebastian", 140, 6);

        System.out.println("Salario del empleado de tiempo completo " + employee1.getName() + ": $" + employee1.calculateSalary() +
                " más el insentivo: $" + employee1.calculateIncentive());
        System.out.println("Salario del empleado de tiempo completo " + employee2.getName() + ": $" + employee2.calculateSalary() +
                " más el insentivo: $" + employee2.calculateIncentive());
    }
}
