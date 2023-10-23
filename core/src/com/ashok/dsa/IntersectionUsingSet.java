package com.ashok.dsa;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class IntersectionUsingSet {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No cycle detected
    }

    public static boolean doLinkedListsIntersect(Collection<ListNode> linkedLists) {
        if (linkedLists == null || linkedLists.size() <= 1) {
            return false;
        }

        Set<ListNode> visitedNodes = new HashSet<>();

        for (ListNode head : linkedLists) {
            if (hasCycle(head)) {
                return true;  // Cycle detected
            }

            ListNode current = head;

            while (current != null) {
                if(visitedNodes.add(current)){
                    current=current.next;
                }else{
                    return true;
                }
            }
        }

        return false;  // No intersection or cycle found
    }

    public static void main(String[] args) {
        ListNode commonNode = new ListNode(3);

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = commonNode;

        ListNode list2 = new ListNode(4);
        list2.next = commonNode;

        ListNode list3 = new ListNode(5);

        List<ListNode> linkedLists = new ArrayList<>();
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
