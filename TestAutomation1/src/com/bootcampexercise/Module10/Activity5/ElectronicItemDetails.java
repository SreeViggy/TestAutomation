package src.com.bootcampexercise.Module10.Activity5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ElectronicItemDetails {

    public static void main(String[] args) {
        double[] price = {32, 43, 56, 78};
        String[] name = {"TV", "Refrigerator", "Washing Machine", "Laptop"};
        HashMap itemHashMap = new HashMap();
        for(int i = 0; i < name.length; i++) {
            itemHashMap.put(name[i], price[i]);
        }

        Iterator it = itemHashMap.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println("Key = " + key + " Value = " + itemHashMap.get(key));
        }

    }

    public static double returnPriceOfItem(HashMap itemHashMap, String name) {
        double val = Double.parseDouble(itemHashMap.get(name).toString());
        return val;
    }

}
