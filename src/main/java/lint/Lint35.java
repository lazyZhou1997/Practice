package lint;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/7 10:56
 * @ModifyBy:
 */
public class Lint35 {

    public ListNode reverse(ListNode head) {

        if (null==head){
            return null;
        }

        ListNode currentNode = head.next;
        ListNode nextNode;
        head.next = null;
        while (null != currentNode) {
            nextNode = currentNode.next;
            currentNode.next = head;
            head = currentNode;
            currentNode = nextNode;
        }

        return head;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
