package src.com.bootcampexercise.Module10;

/**
 * @author Vignesh Krishnan
 **/

 public class Employee extends Person{
   private String jobTitle;
   private String company;
   private double salary;

    public Employee()
    {
        this.jobTitle = "Unknown";
        this.company = "Unknown";
        this.salary = 0;
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
}

