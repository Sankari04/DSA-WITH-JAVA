class Solution {
    public ListNode removeElements(ListNode head, int val) {
    ListNode l1=new ListNode(0);
    l1.next=head;
    ListNode  curr=l1;
        while(curr.next != null){
           if(curr.next.val==val){
               curr.next=curr.next.next;
           }
            else{
                curr=curr.next;
            }
           
        }
        return l1.next;
    }
}
