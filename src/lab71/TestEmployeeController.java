package lab71;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeController {
    public static void main(String[] args) {
        // Create and add employees to the list
        List<Employee> employees = new ArrayList<>();
        employees.add( new FTE() );
        employees.add( new FTE() );
        employees.add( new FTE() );
        employees.add( new Contractor() );
        employees.add( new Contractor() );

        // Controller to proceed -function
        int totalSalary = EmployeeController.totalSalary( employees );
        System.out.printf( "Total salary is: %d", totalSalary );

    }

}
