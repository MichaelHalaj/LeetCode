package Maximum_Length_of_a_Concatenated_String_with_Unique_Characters;
import java.util.ArrayList;
import java.util.List;

public class MaxLength_1239 {
    private static int max;
    public static int maxLength(List<String> arr) {
        /*
        We are trying to find the maximum possible length of concatenation of strings within a list that contain only
        unique characters.

        I implemented a standard backtracking technique where I use a for loop to go through each element in list
        and recursively add and remove from a list. I included a variable to keep track of current count of characters
        within all the strings of the array list.

        I also included a variable within each string iteration to keep track of the length of the current word.
        I discovered that using a variable to keep track of length instead of call .length() cuts some time off.

        I incorporated a map to keep track of the frequency of characters within the current list, and then I iterated
        through all the string's character to make sure every character is unique. If the characters are not unique, just
        return since the current list combination is invalid.

        At the end, if the current combination of characters is valid, compare the max length to the current max length
        and set it accordingly.
         */
        max = 0;
        backtrack(arr, 0, new ArrayList<>());
        return max;

    }
    public static void backtrack(List<String> arr, int index, List<String> curr){
        int currCount = 0;
        int[] alpha = new int[26];
        for(String s : curr){
            int x = 0;
            for(char c : s.toCharArray()){
                if(alpha[c-'a'] >= 1) return;
                alpha[c-'a']++;
                x++;
            }
            currCount += x;
        }
        max = Math.max(currCount, max);
        for(int i = index; i < arr.size(); i++){
            curr.add(arr.get(i));
            backtrack(arr, i + 1, curr);
            curr.remove(curr.size() -1);
        }
    }
}
