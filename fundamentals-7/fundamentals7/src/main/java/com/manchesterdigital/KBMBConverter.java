package com.manchesterdigital;

public class KBMBConverter {
    public static int numberOfMB(int memK) {
        return memK/1024;
    }

    public static int numberOfKB(int memK){
        return memK % 1024;
    }

    public static String stateMBAndKB(int memK){

        int mb = numberOfMB(memK);
        int kb = numberOfKB(memK);

        String mbString = Integer.toString(mb);
        String kbString = Integer.toString(kb);
        return mbString + " MB and " + kbString + " KB";
    }
}
