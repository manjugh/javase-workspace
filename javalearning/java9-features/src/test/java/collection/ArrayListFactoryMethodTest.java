package collection;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.instrument.UnmodifiableClassException;
import java.util.List;

public class ArrayListFactoryMethodTest {

    @Test
    void createImmutableList_WhenValidValues_ThenReturnUnmodifiableList(){
        List<String> javaList = List.of("java9", "java10", "java11","java12","java13");
        Assertions.assertThrows(UnsupportedOperationException.class, () -> javaList.add("java14"));
    }

    @Test
    void createImmutableList_WhenNullValue_ThenEceptiom(){
        assertThatNullPointerException().isThrownBy(() -> List.of(null));
    }
}
