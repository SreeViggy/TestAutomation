/*
Created on 29 July, 2020
 */

package src.com.bootcampexercise.Module10.Activity1;

/**
 * @ Vignesh Krishnan
 */
public abstract class Person {
    // ** Attributes

    public String name;
    public int age;

    // ** Create Getters and Setters
    public String getName() {
        return this.name;
    }

    // setter for String name
    public void setName(String name) {
        this.name = name;
    }

    // getter for int age
    public int getAge() {
        return age;
    }

    // setter for int age
    public void setAge(int age) {
        this.age = age;
    }

    public abstract void introduce();

}




