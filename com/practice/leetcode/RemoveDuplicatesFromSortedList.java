package com.practice.leetcode;

/**
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.
 */

class ListNum {
    int val;
    ListNum next;

    ListNum(int val) {
        this.val = val;
    }
}

public class RemoveDuplicatesFromSortedList{

    public static ListNum deleteDuplicates(ListNum head) {
        // If the list is empty or contains only one node, return it as it is
        if (head == null || head.next == null) {
            return head;
        }

        ListNum current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            // If the current node has the same value as the next node, bypass the next node
            if (current.val == current.next.val) {
                current.next = current.next.next;  // Skip the duplicate node
            } else {
                current = current.next;  // Move to the next node
            }
        }

        return head;
    }

    public static void printList(ListNum head) {
        ListNum current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sorted linked list: 1 -> 1 -> 2
        ListNum head = new ListNum(1);
        head.next = new ListNum(1);
        head.next.next = new ListNum(2);

        System.out.println("Original list:");
        printList(head);

        // Remove duplicates
        head = deleteDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}

