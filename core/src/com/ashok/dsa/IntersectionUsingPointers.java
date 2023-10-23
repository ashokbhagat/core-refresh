package com.ashok.dsa;

import java.util.*;

import java.util.HashSet;
import java.util.Set;

/*
We start by defining a ListNode1 class to represent nodes in the singly-linked lists. Each node has a value (val) and a reference to the next node (next).

The doLinkedListsIntersect method takes an array of singly-linked list heads (linkedLists) and checks if any of these linked lists share a common node (intersect).

We first handle special cases: if the linkedLists array is null or contains only one linked list, there can't be any intersection, so we return false.

We create an array of pointers to store the current positions of each linked list that we are traversing.

We initialize the pointers array with the corresponding heads of the linked lists.

We use a while loop that runs as long as the pointer of the first linked list (pointers[0]) is not null. This loop is used to traverse through the linked lists.

Inside the loop, we use a nested for loop to compare the current node being pointed to by the first linked list (pointers[0]) with the corresponding nodes in the other linked lists. If any of the other pointers is null or points to a different node, we immediately return false because there is no intersection.

If all pointers point to the same node (which means there is an intersection), we advance the first pointer to the next node.

Finally, if we successfully traverse the entire loop without encountering a return statement, we return true, indicating that an intersection was found among the linked lists.

The main method demonstrates how to use the doLinkedListsIntersect method with an example. It creates three linked lists and checks for intersections among them. In this example, the linked lists have a common node, so the output will indicate that an intersection is present.
 */
import java.util.*;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
    }
}

public class IntersectionUsingPointers {
    public static boolean doLinkedListsIntersect(Collection<ListNode1> linkedLists) {
        if (linkedLists == null || linkedLists.size() <= 1) {
            return false;
        }

        ListNode1[] pointers = new ListNode1[linkedLists.size()];
        int index = 0;
        for (ListNode1 head : linkedLists) {
            pointers[index++] = head;
        }

        while (pointers[0] != null) {
            for (int i = 1; i < pointers.length; i++) {
                if (pointers[i] == null || pointers[i] != pointers[0]) {
                    return false;
                }
            }
            pointers[0] = pointers[0].next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode1 commonNode = new ListNode1(3);

        ListNode1 list1 = new ListNode1(1);
        list1.next = new ListNode1(2);
        list1.next.next = commonNode;

        ListNode1 list2 = new ListNode1(4);
        list2.next = commonNode;

        ListNode1 list3 = new ListNode1(5);

        List<ListNode1> linkedLists = new ArrayList<>();
        linkedLists.add(list1);
        linkedLists.add(list2);
        linkedLists.add(list3);

        if (doLinkedListsIntersect(linkedLists)) {
            System.out.println("There is an intersection in traversal of linked lists.");
        } else {
            System.out.println("There is no intersection in traversal of linked lists.");
        }
    }
}
