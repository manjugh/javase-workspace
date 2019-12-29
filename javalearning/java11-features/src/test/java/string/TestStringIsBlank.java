package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestStringIsBlank {

    @Test
    public void isBlank_WhenValidSpaceString_ThenReturnTrue(){
        Assertions.assertThat("".isBlank()).isTrue();
    }

    @Test
    public void isBlank_WhenTabSpaces_ThenReturnTrue(){
        Assertions.assertThat("    ".isBlank()).isTrue();
    }

    @Test
    public void isBlank_WhenStringValue_ThenReturnFalse(){
        Assertions.assertThat("NotBlank".isBlank()).isFalse();
    }


    @Test
    public void isBlank_WhenStringAndEmptySpace_ThenReturnFalse(){
        Assertions.assertThat("Not    Blank".isBlank()).isFalse();
    }


    @Test
    public void isBlank_WhenNullAsString_ThenReturnFalse(){
        Assertions.assertThat("null".isBlank()).isFalse();
    }

    @ParameterizedTest
    @CsvSource({" '', true"})
    public void isBlank_ParameterizedTest(String testStringValue, boolean expectedValue){
        Assertions.assertThat(testStringValue.isBlank()).isEqualTo(expectedValue);
    }

    @ParameterizedTest
    @ValueSource(strings = {" ","    ","\t","\n"})
    public void isBlank_When_returnTrue(String testString){
        Assertions.assertThat(testString.isBlank()).isTrue();
    }


}
