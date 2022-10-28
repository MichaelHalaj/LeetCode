package GroupAnagrams;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnagramsTest {
    @Test
    public void testcase1(){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println((Group_Anagrams.groupAnagrams(strs)));
      /*  assertEquals((Group_Anagrams.groupAnagrams(strs)),
                (Arrays.asList(List.of("bat"),List.of("nat","tan"),List.of("ate","eat","tea"))));
    */
    }

}
