package GroupAnagrams;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        /*
        Explanation 49.Group Anagrams
        ******************************
        The common pattern with anagrams is to create an array of frequencies of characters, which automatically leaves
        the string sorted. However, in this question, I had to use a char[] array in order to convert it into a string.
        This converted string was used as a key in a hashmap to group all words together into a list that had the same
        ordering of characters.
        *******************************
         */
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] a = new char[26];
            for(char c : s.toCharArray()){
                a[c-'a']++;
            }
            String key = new String(a);
            List<String> sub;
            if(map.containsKey(key)){
                sub = map.get(key);
            }else{
                sub = new ArrayList<>();
            }
            sub.add(s);
            map.put(key, sub);
        }
        List<List<String>> res = new ArrayList<>();
        for(String s : map.keySet()){
            res.add(map.get(s));
        }
        return res;
    }
}
