package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringStripTest {

    @ParameterizedTest
    @CsvSource({"' \t  TestString', TestString", "'    TestString    \n', TestString"," Test String , Test String" })
    public void strip(String testString, String expectString){
        Assertions.assertThat(testString.strip()).isEqualTo(expectString);
    }


    @ParameterizedTest
    @CsvSource({"'   TestString', TestString","' \t  TestString', TestString", "'TestString   \n', 'TestString   \n'"," Test String , Test String" })
    public void stripLeadging(String testString, String expectString){
        Assertions.assertThat(testString.stripLeading()).isEqualTo(expectString);
    }

    @ParameterizedTest
    @CsvSource({"'   TestString', '   TestString'","' \t  TestString', ' \t  TestString'", "'TestString   \n', TestString"," Test String , Test String" })
    public void stripTrailing(String testString, String expectString){
        Assertions.assertThat(testString.stripTrailing()).isEqualTo(expectString);
    }
}
