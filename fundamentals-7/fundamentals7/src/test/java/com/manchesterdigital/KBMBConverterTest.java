package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class KBMBConverterTest {

    @Test
    public void whenKBis1024Then1MBReturned() {
        //ARRANGE
        int memInit = 1024;

        //ACT
        int memM = KBMBConverter.numberOfMB(memInit);
        int memK = KBMBConverter.numberOfKB(memInit);
        String memIs = KBMBConverter.stateMBAndKB(memInit);

        //ASSERT
        Assertions.assertThat(memIs).isEqualToIgnoringCase("1 MB and 0 KB");
    }

    @Test
    public void whenKBIs2050Then2MBReturned() {
        //ARRANGE
        int memInit = 2050;

        //ACT
        int memM = KBMBConverter.numberOfMB(memInit);
        int memK = KBMBConverter.numberOfKB(memInit);
        String memIs = KBMBConverter.stateMBAndKB(memInit);

        //ASSERT
        Assertions.assertThat(memIs).isEqualToIgnoringCase("2 MB and 2 KB");

    }
}


