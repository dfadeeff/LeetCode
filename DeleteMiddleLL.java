package CrashCourse;

public class DeleteMiddleLL {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode slow = head;
        // initialize not at head but already at 2 steps forward
        // the fast pointer one step ahead
        ListNode fast = head.next.next;
        System.out.println("Initial slow: " + slow.val);
        System.out.println("Initial fast: " + fast.val);
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Final slow: " + slow.val);
        slow.next = slow.next.next;


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
        DeleteMiddleLL d = new DeleteMiddleLL();
        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(3);
        ListNode three1 = new ListNode(4);
        ListNode four1 = new ListNode(7);
        ListNode five1 = new ListNode(1);
        ListNode six1 = new ListNode(2);
        ListNode seven1 = new ListNode(6);
        one1.next = two1;
        two1.next = three1;
        three1.next = four1;
        four1.next = five1;
        five1.next = six1;
        six1.next = seven1;

        ListNode result1 = d.deleteMiddle(one1);

        // Print the resulting linked list
        System.out.println("Resulting linked list:");
        d.printLinkedList(result1);
    }
}
