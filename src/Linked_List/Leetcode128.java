package Linked_List;

//Given the head of a linked list, return the list after sorting it in ascending order.
//[4,2,1,3]
public class Leetcode128 {
    public ListNode sortList(ListNode head) {
        if (head==null||head.next==null)return head;

        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        return merge(left,right);
    }
    public static ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }

    public static ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (list1!=null && list2!=null){
            if (list1.val<list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = (list1!=null)?list1:list2;
        return dummy.next;
    }
}
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}