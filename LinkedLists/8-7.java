/*
 * Time (mm): 5
 * Chapter/Problem: 8-7 
 * Page on EPI:
 * Self Evaluation: 3/3
 * Assumptions:
 *
 * class ListNode<T> {
 *  T data;
 *  ListNode<T> next;
 * }
 */

public static ListNode<Integer> deleteKthElement(ListNode<Integer> head, int k) {
  ListNode<Integer> fast = head;
  ListNode<Integer> slow = head;
  
  while(k-- > 0 && fast != null)
    fast = fast.next;

  while(fast != null) {
    fast = fast.next;
    slow = slow.next;
  }

  slow.next = slow.next.next;

  return head; 
}
