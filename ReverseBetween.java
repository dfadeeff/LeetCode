package CrashCourse;

import java.util.List;

public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null) {
            return null;
        }

        ListNode cur = head;
        ListNode prev = null;

        while (left > 1) {
            prev = cur;
            cur = cur.next;
            left--;
            right--;
        }

        // The two pointers that will fix the final connections.
        ListNode con = prev, tail = cur;

        // Iteratively reverse the nodes until n becomes 0.
        ListNode third = null;
        while (right > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            right--;
        }
        // Adjust the final connections as explained in the algorithm
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }


    public void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        ReverseBetween r = new ReverseBetween();

        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(2);
        ListNode three1 = new ListNode(3);
        ListNode four1 = new ListNode(4);
        ListNode five1 = new ListNode(5);
        one1.next = two1;
        two1.next = three1;
        three1.next = four1;
        four1.next = five1;
        int left1 = 2;
        int right1 = 4;
        ListNode result1 = r.reverseBetween(one1, left1, right1);
        // Print the resulting linked list
        System.out.println("Resulting linked list:");
        r.printLinkedList(result1);

        ListNode one2 = new ListNode(5);
        int left2 = 1;
        int right2 = 1;
        ListNode result2 = r.reverseBetween(one2, left2, right2);
        // Print the resulting linked list
        System.out.println("Resulting linked list:");
        r.printLinkedList(result2);
    }
}
