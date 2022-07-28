package src.com.bootcampexercise.module8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList();
        list.add(0, "Vignesh");
        list.add(1, "Shivani");


        //TODO: 2 - Call print method to print the list passed as its parameter.
        //for(int i = 0; i <list.size(); i++) {
            print(list);
        //}

    }

    static void print(List list)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        Iterator<Object> iterator = list.iterator();

        for (Object obj : list) {
            System.out.println(obj.toString());
        }

    }
}
