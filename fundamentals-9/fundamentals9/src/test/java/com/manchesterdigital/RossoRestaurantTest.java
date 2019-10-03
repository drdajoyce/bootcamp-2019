package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RossoRestaurantTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void whenMexicanRequestedReturnsMexicanDishes() {
        //ARRANGE
        String mexican = Dishes.MEXICAN.toString();


        //ACT
        String result = RossoRestaurant.dishType(mexican);

        //ASSERT
        Assertions.assertThat(result).isEqualTo("Taco, Burrito");


    }

    @Test
    public void whenIndianRequestedReturnsIndianDishes() {
        //ARRANGE
        String indian = Dishes.INDIAN.toString();


        //ACT
        String result = RossoRestaurant.dishType(indian);

        //ASSERT
        Assertions.assertThat(result).isEqualTo("Tandoori Chicken, Bhuna Ghosht");


    }

    @Test
    public void whenPanAsianRequestedReturnsPanAsianDishes() {
        //ARRANGE
        String panAsian = Dishes.PAN_ASIAN.toString();


        //ACT
        String result = RossoRestaurant.dishType(panAsian);

        //ASSERT
        Assertions.assertThat(result).isEqualTo("Stir fry noodles, Dimsum");
    }

    @Test
    public void whenEnglishRequestedReturnsEnglishDishes() {
        //ARRANGE
        String english = Dishes.ENGLISH.toString();


        //ACT
        String result = RossoRestaurant.dishType(english);

        //ASSERT
        Assertions.assertThat(result).isEqualTo("Beef Wellington, Fish and Chips");
    }

    @Test(expected = InvalidRegionException.class)
    public void whenUnsupportedRegionIsRequestedThrowException() {

        RossoRestaurant.dishType("German");
    }
}
