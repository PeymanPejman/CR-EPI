/*
 * Time (mm): 13 
 * Chapter/Problem: 8-3 
 * Page on EPI: 117
 * Self Evaluation: 3/3
 * Assumptions:
 *
 * class ListNode<T> {
 *  T data;
 *  ListNode<T> next;
 * }
 */

public static ListNode<Integer> isCyclical(ListNode<Integer> Node) {
  if (Node == null)
    return Node;

  ListNode<Integer> slow = Node;
  ListNode<Integer> fast = Node.next;
  int len = 0;
  while(fast != null) {
    if(fast == slow) {
      len = 1;
      fast = fast.next;
      while(fast != slow) {
        fast = fast.next;
        len++;
      }
    }

    if(fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
  }

  if (len == 0)
    return null;
  
  slow = head;
  fast = head;
  for(int i=0; i<len; i++){
    fast = fast.next;
  }

  while(fast!= slow) {
    slow = slow.next;
    fast = fast.next;
  }

  return fast; 
}
