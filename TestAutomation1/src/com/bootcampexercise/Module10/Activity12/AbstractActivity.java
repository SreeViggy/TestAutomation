package src.com.bootcampexercise.Module10.Activity12;

public class AbstractActivity {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Students student = new Students();

        employee.setName("Vignesh");
        employee.setAge(32);

        employee.setJobTitle("Test Automation Engineer");
        employee.setCompany("Accenture");
        employee.setsalary(2500.00);
        employee.introduce();

        student.setSchoolName("Riga Technical University");
        student.introduce();
    }

}
