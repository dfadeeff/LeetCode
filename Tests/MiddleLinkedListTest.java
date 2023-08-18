package CrashCourse.Tests;

import CrashCourse.ListNode;
import CrashCourse.MiddleLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleLinkedListTest {
    @Test
    public void testMiddleNodeOddLength() {
        MiddleLinkedList m = new MiddleLinkedList();
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        h1.next = h2;
        h2.next = h3;
        ListNode result = m.middleNode(h1);
        System.out.println("Result: " + result.val); // Print the result
        assertEquals(h2, result);
    }

    @Test
    public void testMiddleNodeEvenLength() {
        MiddleLinkedList m = new MiddleLinkedList();
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        ListNode result = m.middleNode(h1);
        System.out.println("Result: " + result.val); // Print the result
        assertEquals(h3, result);
    }
}

