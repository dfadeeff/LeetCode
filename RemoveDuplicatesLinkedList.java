package CrashCourse;

public class RemoveDuplicatesLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    // Utility method to print the linked list values
    public void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveDuplicatesLinkedList r = new RemoveDuplicatesLinkedList();
        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(1);
        ListNode three1 = new ListNode(2);
        one1.next = two1;
        two1.next = three1;

        ListNode result1 = r.deleteDuplicates(one1);

        // Print the resulting linked list
        System.out.println("Resulting linked list:");
        r.printLinkedList(result1);

    }
}
