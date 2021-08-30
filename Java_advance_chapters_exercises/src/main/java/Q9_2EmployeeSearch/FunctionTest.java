package Q9_2EmployeeSearch;


import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author oracle
 */
public class FunctionTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    ToDoubleFunction<Employee> eFunc =
              e -> e.getSalary() * Bonus.byRole(e.getRole());
                      
            // Write your function lambda here
      
    System.out.println("=== First Employee Bonus");
    first.printSummary();
    // Print the result here
    System.out.println("Bonus: " + eFunc.applyAsDouble(first));
        
  }
}
