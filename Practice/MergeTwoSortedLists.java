package Practice;

/**
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list.
    The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the merging process
        ListNode temp = new ListNode(0);
        ListNode tempHead = temp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
               temp.next = list1;
               list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
           temp.next = list1;
        }
        if (list2 != null) {

        }

        return tempHead.next;
    }

    public static void main(String[] args) {
        // Example: List1: 1 -> 2 -> 4, List2: 1 -> 3 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode mergedList = mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        // Output: 1 1 2 3 4 4
    }
}
