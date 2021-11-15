
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        if (k == 1) return head;
        while (true) {
            int count = 0;
            ListNode p = cur;
            for (int i = 0; i < k; i++) {
                if (p.next != null) {
                    p = p.next;
                    count++;
                } else {
                    break;
                }
            }
            if (k < count) break;
            ListNode first = cur.next, second = cur.next.next;
            for (int i = 0; i < k - 1; i++) {
                ListNode tmp = second.next;
                second.next = first;
                first = second;
                second = tmp;
            }
            ListNode q = cur.next;
            cur.next.next = second;
            cur.next = first;
            cur = q;
        }
        return dummy.next;
    }
}