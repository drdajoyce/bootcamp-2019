package com.manchesterdigital;

import java.util.List;

public class WordSplitter {

    public static void main(String[] args) {

        String baseball = wordSplitter("Baseball", "a,all,b,ball,bus,base,cat,code,d,e,quit,z");
        System.out.println("baseball = " + baseball);

        String basketball = wordSplitter("Basketball", "a,all,b,ball,bus,base,cat,code,d,e,basket,z");
        System.out.println("basketball = " + basketball);

    }

    public static String wordSplitter(String wholeWord, String list) {
        StringBuilder result = new StringBuilder();
        String[] splitList = list.split(",");

        for (String entry1 : splitList) {
            for (String entry2 : splitList) {
                StringBuilder temp = new StringBuilder();
                temp.append(entry1).append(entry2);
                if (temp.toString().equalsIgnoreCase(wholeWord)){
                    result.append(entry1).append(",").append(entry2);
                }
            }
        }
//with fori
//        for (int i = 0; i < splitList.length; i++) {
//            for (int j = 0; j < splitList.length; j++) {
//                StringBuilder temp = new StringBuilder();
//                temp.append(splitList[i]).append(splitList[j]);
//                if (temp.toString().equalsIgnoreCase(wholeWord)){
//                    result.append(splitList[i]).append(",").append(splitList[j]);
//                }
//            }
//        }


        return result.toString();
    }

}
