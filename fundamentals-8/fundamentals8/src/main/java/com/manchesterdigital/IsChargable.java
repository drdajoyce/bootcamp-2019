package com.manchesterdigital;

public interface IsChargable {

    void supercharge();

    default void describe(){
        System.out.println("I'm green!");
    } //becomes implicitly available to the Tesla class.
}
