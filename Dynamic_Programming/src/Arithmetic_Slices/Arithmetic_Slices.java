package Arithmetic_Slices;

public class Arithmetic_Slices {
    public static int numberOfArithmeticSlices(int[] nums){
       /*
       Explanation (Question #413)
       ******************************************
       The question requires to find all contiguous subarrays where the difference between each number in subarray is equal.
       So we have a single int variable that keeps track of the count of subequences.

       We have a for loop that goes through the enire array; however, we start at index 2 so that we can stay in bounds
       while checking that the difference between the number at index and index - 1 is equal to the number at index - 1
       and index - 2. (Ex. [1, 2, 3] ->  (3 - 2) == (2 - 1))

       We have a prev variable that checks whether the previous subarray is in fact valid. For example, if the subarray is valid
       at index = 2, then prev would be incremented by 1, where prev = 1 when index = 3. Now at index 3, if we determine that
       everything is valid (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]), then we continue to increase prev and
       add it to the total number of subsequences. However, if the condition is not satisfied, we set prev to 0, signifying
       that the subarray is not valid.

       ******************************************
        */
        int subsequence = 0;
        for(int i = 2, prev = 0; i < nums.length; i++){
            subsequence += (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) ? ++prev : (prev = 0);
        }
        return subsequence;
    }
}

