package testy1;

public class Palindrome {

    public static boolean isPalindrome(String word) {

        if (word==null || word.trim().length()==0) { // jeśli nie sprawdzimy wcześniej nulla to piszemy tylko: "".equals(word)
            return false;
        }

        if (word.length()>100) {
            throw new WordIsToLongException("Słowo nie może być dłuższe niż 100 znaków");
        }

        String wordWithReplacedSpaces = word.replace(" ", "");
        String reversedString = new StringBuilder(wordWithReplacedSpaces).reverse().toString();

        return wordWithReplacedSpaces.equals(reversedString);
    }
}
