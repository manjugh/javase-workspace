package stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremMethodsTest {
    /**
     *  Exploring the new methods added in the java 9
     *  1. TakeWhile
     *  2. DropWhile
     *  3. iterate
     */

    @Test
    @DisplayName("Stream.takeWhile method sequential procesing")
    /**
     * takeWhile will take all the values until the condition becomes false
     */
    void takeWhile_(){
        Stream<String> langauegStream = Stream.of("java", "C++", "Kotlin", "grooovy","ruby");
        List<String> languageSublist = langauegStream.takeWhile(str -> str.length() < 7).collect(Collectors.toList());
        Assertions.assertThat(Arrays.asList("java", "C++", "Kotlin")).isEqualTo(languageSublist);
    }


    @Test
    @DisplayName("Stream.dropWhile method sequential procesing")
    /**
     * dropwhile will drop all the values until the predicate fails.
     */
    void dropWhile_(){
        Stream<String> langauegStream = Stream.of("java", "C++", "Kotlin", "grooovy","ruby","php");
        List<String> languageSublist = langauegStream.dropWhile(str -> str.length() < 7).collect(Collectors.toList());
        Assertions.assertThat(Arrays.asList("grooovy", "ruby","php")).isEqualTo(languageSublist);
    }
}
