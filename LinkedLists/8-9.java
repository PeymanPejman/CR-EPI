/*
 * Time (mm): 12
 * Chapter/Problem: 8-9
 * Page on EPI: 125
 * Self Evaluation: 2/3 did not see the k==0
 * Assumptions: 
 *
 * class ListNode<T> {
 *  T data;
 *  ListNode<T> next;
 * }
 */

public static ListNode<Integer> shiftRight(ListNode<Integer> head, int k) { 
  if(head == null)
   return head;

  ListNode<Integer> fast = head;
  ListNode<Integer> slow = head;

  int len = 0;
  while(slow != null){
    slow = slow.next;
    len++;
  }
  k = len % k;
  slow = head;

  if(k==0)
    return head;

  while(k-- >0 && fast != null) {
    fast = fast.next;
  }

  if(fast == null)
    return head; 

  while(fast.next != null) {
    slow = slow.next;
    fast = fast.next;
  }

  ListNode<Integer> newHead = slow.next;

  slow.next = null;
  fast.next = head;

 return newHead; 
}
