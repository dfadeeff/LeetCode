package CrashCourse;

public class ReverseLinkedList {
    public ListNode reverseLinkedList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;  // first, make sure we don't lose the next node
            curr.next = prev;               // reverse the direction of the pointer
            prev = curr;                   // set the current node to prev for the next node
            curr = nextNode;               // move on

        }
        return prev;
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
        ReverseLinkedList r = new ReverseLinkedList();

        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(2);
        ListNode three1 = new ListNode(3);
        ListNode four1 = new ListNode(4);
        one1.next = two1;
        two1.next = three1;
        three1.next = four1;

        ListNode result1 = r.reverseLinkedList(one1);

        // Print the resulting linked list
        System.out.println("Resulting linked list:");
        r.printLinkedList(result1);

    }
}
