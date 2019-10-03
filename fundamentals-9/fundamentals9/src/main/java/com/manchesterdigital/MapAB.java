package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class MapAB {
    public static Map<String, String> mapAb(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            /*StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(map.get())
            map.put("ab", "HiThere");*/

            Map<String, String> result = new HashMap<>();
            result.putAll(map);

            String aValue = map.get("a");
            String bValue = map.get("b");

            result.put("ab", String.format("%s%s", aValue, bValue));
            return result;

        }
        return map;
    }
}

