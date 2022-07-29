package src.com.bootcampexercise.Module10.Activity4;

import src.com.bootcampexercise.Module10.Activity2.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args){
        Employee emp1 = new Employee("Test Automation Engineer", "Accenture", 2400.00);
        Employee emp2 = new Employee("Software Engineer", "CTS", 2200.00);
        Employee emp3 = new Employee("Product Owmer", "Infosys", 2300.00);
        Employee emp4 = new Employee("Scrum Master", "Microsoft", 3500.00);
        Employee emp5 = new Employee("Sales Engineer", "Google", 3700.00);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        Employee emp = new Employee();
        System.out.println("The Employee whose salary is the highest is "+emp.getHighestPaidEmp(empList));
    }

}
