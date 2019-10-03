package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        /*will use the has codes rather than the entries in the key parameter to find things.
         */
        countries.put("enGB", "England");
        countries.put("esEs", "Spain");
        countries.put("ptPt", "Portugal");

//        HashMap<String, String> names = new HashMap<>();
//        names.put("John", "John"); //no interchangeability - nobody can change this map!

        String key = "ptPt";

        String portugal = countries.get(key);
        System.out.println("portugal = " + portugal);

        countries.put(key, "DUNCAN"); //overwrites Portugal, so now the thing located at "ptPt" is "DUNCAN".

        portugal = countries.get(key);
        System.out.println("portugal = " + portugal);

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "John");
//        names.put(1, "Andrew"); would cause a duplicate
        names.put(2, "Andrew");

        String removedName = names.remove(2);//accepts both key & key with value.
        System.out.println("removedName = " + removedName);

//      names.remove(2); //repeating would return nothing.

        //empties the map, leaving the object existing but with nothing in it.
        names.clear();

        System.out.println("number of items in map = " + names.size());

        names.put(1, "April");
        names.put(2, "Sania");
        names.put(3, "Schmek");

        for (Map.Entry<Integer, String> me : names.entrySet()){
            System.out.println("key = " +me.getKey() + ", value = " +me.getValue());
        }

        for (Integer mapKey : names.keySet()){
            System.out.println("mapKey = " + mapKey);
        }

        for (String val : names.values()){
            System.out.println("val = " + val);
        }

        if(names.containsKey(1)){
            System.out.println("There is ID 1");
        }

        System.out.println("Found value? " + names.containsValue("123456"));



    }

}
