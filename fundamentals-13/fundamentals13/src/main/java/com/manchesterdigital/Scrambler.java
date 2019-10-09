package com.manchesterdigital;

import java.util.Arrays;
import java.util.List;

public class Scrambler {

    public static void main(String[] args) {
        System.out.println(scramble("duncan", "candun"));
        System.out.println(scramble("cdoer", "coder"));
        System.out.println(scramble("hello", "hkllo"));


    }



    public static boolean scramble(String string1, String string2) {
        boolean truth = false;

        String[] split1 = string1.split("");

        Arrays.sort(split1);

        for (String letter : split1){
            if (string2.contains(letter)){
                truth = true;
            } else{ truth = false;
            break;
            }
        }

        return truth;
    }
}
