package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestStringRepeat {


    @ParameterizedTest
    @CsvSource({"foo,foofoo,2","foo,foofoofoo,3"})
    public void repeat_parameterizedTest(String testString, String expectedOutPut, int count){
        Assertions.assertThat(testString.repeat(count)).isEqualTo(expectedOutPut);
    }

    @Test
    public  void repeat_WhenZeroAsRepeatCount_ReturnEmptyString(){
        Assertions.assertThat("test".repeat(0)).isEqualTo("");
        Assertions.assertThat("test".repeat(0)).isEmpty();
    }

    @Test
    public void repeat_WhenNegativeRepeatCount_ThenThrowException(){
        Assertions.assertThatIllegalArgumentException().isThrownBy(() -> "testString".repeat(-1)).withMessageContaining("count is negative");

    }

    @Test
    public void repeat_WhenMaxIntegerValue_ThenReturnEmptyString(){
        //"testString".repeat(Integer.MAX_VALUE);
        Assertions.assertThatThrownBy(() -> "testString".repeat(Integer.MAX_VALUE)).hasRootCauseExactlyInstanceOf(OutOfMemoryError.class);
        //Assertions.assertThat("testString".repeat(Integer.MAX_VALUE)).isEmpty();
    }
}
