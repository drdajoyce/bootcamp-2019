package com.manchesterdigital;

import java.util.ArrayList;

public class ShoppingList {
    public ArrayList<String> shoppingListArray = new ArrayList<>();

    public void addItem(String itemAdding){
        shoppingListArray.add(itemAdding);
    }
}
