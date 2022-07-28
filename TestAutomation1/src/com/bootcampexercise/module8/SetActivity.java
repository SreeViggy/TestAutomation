package src.com.bootcampexercise.module8;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        HashSet names = new HashSet();
        //Also try adding a few duplicate entries to this set.
        names.add("Sreeja");
        names.add("Vignesh");
        names.add("Shivani");
        names.add("Vignesh");

        //TODO: 2 - Call print method to print the set passed as its parameter.
        print(names);
    }

    static void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object obj : set) {
            System.out.println(obj.toString());
        }
    }
}


