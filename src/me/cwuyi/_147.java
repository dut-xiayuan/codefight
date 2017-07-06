package me.cwuyi;

/**
 * Created by XIA on 2017/7/5.
 */
public class _147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode p = head;
        ListNode l = head.next;

        while (l != null) {
            ListNode temp = p;
            while (p.val < l.val) {
                p = p.next;
            }

        }
        return p.next;
    }

}
