package CrashCourse;

public class MiddleLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MiddleLinkedList m = new MiddleLinkedList();
        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(2);
        ListNode three1 = new ListNode(3);
        ListNode four1 = new ListNode(4);
        one1.next = two1;
        two1.next = three1;
        three1.next = four1;
        ListNode result1 = m.middleNode(one1);
        System.out.println(result1.val);

        ListNode one2 = new ListNode(1);
        ListNode two2 = new ListNode(2);
        ListNode three2 = new ListNode(3);
        ListNode four2 = new ListNode(4);
        ListNode five2 = new ListNode(5);
        ListNode six2 = new ListNode(6);
        one2.next = two2;
        two2.next = three2;
        three2.next = four2;
        four2.next = five2;
        five2.next = six2;
        ListNode result2 = m.middleNode(one2);
        System.out.println(result2.val);
    }
}
