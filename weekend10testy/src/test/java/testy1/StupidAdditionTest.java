package testy1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StupidAdditionTest {

    @ParameterizedTest
    @MethodSource("generateData")
    @DisplayName("Should add without exception")
    void stupidAdd(int a, String b, boolean c, int result) {

        StupidAddition stupidAddition = new StupidAddition();
        int actualResult = stupidAddition.stupidAdd(a, b, c);
        assertEquals(result, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testdata.csv")
    void csvStupidAddTest(int a, String b, boolean c, int result) {
        System.out.println(a);
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(0, "0", true, 0),
                Arguments.of(10, "20", false, 0),
                Arguments.of(1, "100", true, 101)
        );
    }
}
