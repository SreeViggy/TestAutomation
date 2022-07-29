package src.com.bootcampexercise.Module10.Activity2;

import src.com.bootcampexercise.Module10.Activity1.Person;

public class Students extends Person {
    private String schoolName;

    // getter for String schoolName
    public String getSchoolName() {
        return this.schoolName;
    }

    // setter for String schoolName
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce() {
        System.out.println("I study in  "+  getSchoolName());
    }
}
