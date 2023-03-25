import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        //Employee employee = new Employee();
        Logger logger = Logger.getLogger(Employee.class.getName());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("patrik", "drazic", 35, 30));
        employeeList.add(new Employee("roberto", "kano", 22.65, 80.30));
        employeeList.add(new Employee("juraj", "peric", -28, 45));
        employeeList.add(new Employee("ante", "antic", 33, -20));

        for (Employee employee : employeeList){
            try{
                double salary = employee.calculateSalary();
                logger.info("Salary for " + employee.getFullName() + " is " + salary + " KN.");
            }catch (ExceptionSalaryCalculator e){
                logger.warning("Error in the process... " + e.getMessage());
            }
        }
    }
}
