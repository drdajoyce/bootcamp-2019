package com.manchesterdigital;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class RegMeNowTest {
    // paired with Duncan
    // exeption not done is the Capital Letters!
    // expected exception is empty at the moment
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void whenLetterSisInputReturn5() {
        // Arrange
        String numberPlate = "SPPPP";
        // Act
        String result = RegMeNow.characterConverter(numberPlate);
        // Assert
        Assertions.assertThat(result).isEqualToIgnoringCase("5PPPP");
    }
    @Test
    public void whenLetterAisInputReturn4() {
        // Arrange
        String numberPlate = "APPPP";
        // Act
        String result = RegMeNow.characterConverter(numberPlate);
        // Assert
        Assertions.assertThat(result).isEqualToIgnoringCase("4PPPP");
    }
    @Test
    public void whenLetterGisInputReturn9() {
        // Arrange
        String numberPlate = "GPPPP";
        // Act
        String result = RegMeNow.characterConverter(numberPlate);
        // Assert
        Assertions.assertThat(result).isEqualToIgnoringCase("9PPPP");
    }
    @Test
    public void whenLetterBisInputReturn8() {
        // Arrange
        String numberPlate = "BPPPP";
        // Act
        String result = RegMeNow.characterConverter(numberPlate);
        // Assert
        Assertions.assertThat(result).isEqualToIgnoringCase("8PPPP");
    }
    @Test
    public void whenLetterIisInputReturn1() {
        // Arrange
        String numberPlate = "IPPPP";
        // Act
        String result = RegMeNow.characterConverter(numberPlate);
        // Assert
        Assertions.assertThat(result).isEqualToIgnoringCase("1PPPP");
    }
    @Test
    public void whenSisContaintedInNumberPlateChangeTo5() {
        // Arrange
        String numberPlate = "XYSLP";
        // Act
        String result = RegMeNow.characterConverter(numberPlate);
        // Assert
        Assertions.assertThat(result).isEqualToIgnoringCase("XY5LP");
    }
    @Test
    public void whenAllBadCharactersPresentReturnNumericEquvilent() {
        // Arrange
        String numberPlate = "SAGBI";
        // Act
        String result = RegMeNow.characterConverter(numberPlate);
        // Assert
        Assertions.assertThat(result).isEqualToIgnoringCase("54981");
    }
    @Test
    public void whenLengthSevenPlateOutputIsSevenLength() {
        // Arrange
        String numberPlate = "SAGBIPQ";
        // Act
        String result = RegMeNow.characterConverter(numberPlate);
        // Assert
        Assertions.assertThat(result).isEqualToIgnoringCase("54981PQ");
    }
    @Test (expected = RegMeNowException.class)
    public void whenLengthOverSevenThrowException() {
        // Arrange
        String numberPlate = "SAGBIPQP";
        // Act
        RegMeNow.characterConverter(numberPlate);
    }
    @Test (expected = RegMeNowException.class)
    public void whenLengthUnderFiveThrowException() {
        // Arrange
        String numberPlate = "SAGB";
        // Act
        RegMeNow.characterConverter(numberPlate);
    }
}