package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class ShoppingListTest {

    @Test
    public void whenAddItemUsedThenListHasOneMoreItem() {

        //ARRANGE
        String item1 = "Apple";
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(item1);

        //ACT
        String firstItem = shoppingList.shoppingListArray.get(0);


        //ASSERT
        Assertions.assertThat(firstItem).isEqualToIgnoringCase(item1);

    }
}
