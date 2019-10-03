package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapABTest {

    @Test
    public void whenKeyAPresentThenMapUnchanged() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "Hi");

        Map<String, String>result = MapAB.mapAb(map);

        Assertions.assertThat(result ).isEqualTo(map);

    }

    @Test
    public void whenKeyBPresentThenMapUnchanged() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("b", "There");

        Map<String, String>result = MapAB.mapAb(map);

        Assertions.assertThat(result ).isEqualTo(map);
    }

    @Test
    public void whenKeysAAndBPresentThenMapAppended() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "Hi");
        map.put("b", "There");


        Map<String, String>result = MapAB.mapAb(map);

        Assertions.assertThat(result ).containsKey("ab");
    }

    @Test
    public void whenABKeyAddedValuesConcatenateFromAandB() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "Hi");
        map.put("b", "There");


        Map<String, String>result = MapAB.mapAb(map);

        Assertions.assertThat(result).containsValue("HiThere");
    }

    @Test
    public void whenABKeyAddedValueisSomethingElse() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "Thanks");
        map.put("b", "Duncan");


        Map<String, String>result = MapAB.mapAb(map);

        Assertions.assertThat(result).containsValue("ThanksDuncan");
    }
}
