package src.com.bootcampexercise.Module10.Activity2;

import src.com.bootcampexercise.Module10.Activity1.Person;

import java.util.List;

/**
 * @author Vignesh Krishnan
 **/

 public class Employee extends Person {
   private String jobTitle;
   private String company;
   private double salary;

    public Employee()
    {
        this.jobTitle = "Unknown";
        this.company = "Unknown";
        this.salary = 0;
    }

    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    // getter for String JobTitle
    public String getJobTitle() {
        return this.jobTitle;
    }

    // setter for String JobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // getter for String Company
    public String getCompany() {
        return this.company;
    }

    // setter for String Company
    public void setCompany(String company) {
        this.company = company;
    }

    // getter for String salary
    public double getSalary() {
        return this.salary;
    }

    // setter for String salary
    public void setsalary(double salary) {
        this.salary = salary;
    }

    // This method is overridden from Person class
    public void introduce() {
        System.out.println("My Name is " + getName() + " and I am "+ getAge() +" years old");
        System.out.println("I am a " + getJobTitle() + " and My Salary is " + getSalary() + "Euros.");
    }

    public double getHighestPaidEmp(List<Employee> empList) {
        double largest = 0;
        for(int i = 0; i <empList.size(); i++) {
            if(empList.get(i).getSalary() > largest) {
                largest = empList.get(i).getSalary();
            }
        }
        return largest;
    }
}

