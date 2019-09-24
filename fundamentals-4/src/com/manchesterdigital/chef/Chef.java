package com.manchesterdigital.chef;

import com.manchesterdigital.BakingExample;

public class Chef {

    public static void main(String[] args) {
        BakingExample bakingExample = new BakingExample();
        bakingExample.decorate(); //only accessible because decorate is public.
    }
}
