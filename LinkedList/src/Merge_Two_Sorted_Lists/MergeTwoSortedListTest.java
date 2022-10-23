package Merge_Two_Sorted_Lists;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class MergeTwoSortedListTest {
    @Test
    void testcase() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode correct = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, null))))));
        assertEquals(Merge_Two_Sorted_Lists.mergeTwoLists(list1, list2), correct);

    }
}
