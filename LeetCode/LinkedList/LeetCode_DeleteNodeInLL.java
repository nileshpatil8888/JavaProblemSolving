package LeetCode.LinkedList;

public class LeetCode_DeleteNodeInLL {

    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public void deleteNode(ListNode node){
        if(node== null || node.next == null){
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
