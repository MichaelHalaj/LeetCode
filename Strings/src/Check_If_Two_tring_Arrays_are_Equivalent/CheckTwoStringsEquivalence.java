package Check_If_Two_tring_Arrays_are_Equivalent;

public class CheckTwoStringsEquivalence {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        /*
        Explanation (#1662) O(n)
        ************************************
        Go through each array and append to a string builder and return if they are equal.
        ************************************
         */
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s : word1){
            sb1.append(s);
        }
        for(String s : word2){
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
