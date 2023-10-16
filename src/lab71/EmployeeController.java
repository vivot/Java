package lab71;

import java.util.List;

public class EmployeeController {

    public static int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();

        }
        return totalSalary;
    }
}
