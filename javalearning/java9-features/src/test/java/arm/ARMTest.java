package arm;


import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ARMTest {

    @Test
    void testArm() throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new FileReader("pom.xml"));
        try (bufferedReader) {
            System.out.println(bufferedReader.readLine());
        }

        System.out.println(bufferedReader.readLine());
    }

    @Test
    void testArm_beforejava9() throws IOException {
        try (final BufferedReader bufferedReader = new BufferedReader(new FileReader("pom.xml"))) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
