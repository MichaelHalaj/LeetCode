package Check_If_Two_tring_Arrays_are_Equivalent;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckTwoStringsEquivalenceTest {

    @Test
    void testcase1(){
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        assertTrue(CheckTwoStringsEquivalence.arrayStringsAreEqual(word1, word2));
    }
    @Test
    void testcase2(){
        String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
        assertFalse(CheckTwoStringsEquivalence.arrayStringsAreEqual(word1, word2));
    }
}
