package Merge_Two_Sorted_Lists;

public class Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
        Explanation (Question #21)
        ********************************
        Create a dummy node and then iterate through both lists, appending the lesser value of the two lists
        to the dummy list. At the end if, one of the two lists is not null, that means there are still numbers that
        need to be appended to the dummy list. Since the values are already sorted, I just have to add the rest of linked list
        to the dummy.
        ********************************
         */
        ListNode dummy = new ListNode(0);
        ListNode dummy2 = dummy;

        while(list1 != null && list2 != null){
            if(list1.val >= list2.val){
                dummy2.next = list2;
                list2 = list2.next;
            }else{
                dummy2.next = list1;
                list1 = list1.next;
            }
            dummy2 = dummy2.next;
        }
        dummy2.next = list1 != null ? list1 : list2;

        return dummy.next;
    }
}
