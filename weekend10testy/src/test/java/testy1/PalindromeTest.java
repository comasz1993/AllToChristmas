package testy1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    @DisplayName("W normalnym przypadku zwróć true :)")
    //@RepeatedTest(10000) // powtarza nam test daną ilość razy
    void testRegularCase() {
        boolean actualResult=Palindrome.isPalindrome("ala");

        assertTrue(actualResult);
    }

    @Test
    @DisplayName("Should return true when pass full sentence")
    void testSentenceWithSpacces() {
        boolean actualResult=Palindrome.isPalindrome("pętaka pętaj a tępaka tęp");

        assertTrue(actualResult);
    }

    @Test
    @DisplayName("Should return false when pass null")
    void testNull() {
        boolean actualResult=Palindrome.isPalindrome(null);

        assertFalse(actualResult);
    }

    @Test
    @DisplayName("Should return false when pass null")
    void testWhiteSpaces() {
        boolean actualResult=Palindrome.isPalindrome("      ");

        assertFalse(actualResult);
    }
}