package testy1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeParamTest {

    @ParameterizedTest(name="Odpalam test nr #{index} z argumentami [{arguments}]")
    @ValueSource(strings={"ala", "alla"})
    void shouldBePalindrome(String word) {
        boolean palindrome = Palindrome.isPalindrome(word);
        assertTrue(palindrome);
    }

    @ParameterizedTest
    @MethodSource("createTestDataFromFile")
    void shouldNotBePalindrome(String word) {
        boolean palindrome = Palindrome.isPalindrome(word);
        assertFalse(palindrome);
    }

    static Stream<String> createTestDataFromFile() throws FileNotFoundException {
        //tutaj można wszystko
        Scanner scanner = new Scanner(new File("testdata.txt"));

        List<String> strings = new ArrayList<>();
        while(scanner.hasNextLine()) {
            strings.add(scanner.nextLine());
        }

        return strings.stream();
    }
}
