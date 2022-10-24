package Maximum_Length_of_a_Concatenated_String_with_Unique_Characters;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxLengthTest {
    @Test
    public void testcase1(){
        List<String> test1 = new ArrayList<>(Arrays.asList("un","iq","ue"));
        assertEquals(MaxLength_1239.maxLength(test1), 4);
    }
    @Test
    public void testcase2(){
        List<String> test2 = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"));
        assertEquals(MaxLength_1239.maxLength(test2), 16);
    }
    @Test void testcase3(){
        List<String> test3 = new ArrayList<>(Arrays.asList("aa", "bb"));
        assertEquals(MaxLength_1239.maxLength(test3), 0);
    }
}
