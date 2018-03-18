/*
 * Time (mm): 6
 * Chapter/Problem: 8-8 
 * Page on EPI: 124
 * Self Evaluation: 3/3
 * Assumptions:
 *
 * class ListNode<T> {
 *  T data;
 *  ListNode<T> next;
 * }
 */

public static ListNode<Integer> removeDuplicates(ListNode<Integer> head) {
  if(head == null)
    return head;

  ListNode<Integer> iter = head.next; 
  ListNode<Integer> curr = head;

  while(iter != null) {
    while(iter != null && iter.data == curr.data) {
      iter = iter.next;
    }

    curr.next = iter;
    curr = iter;
    iter = iter.next;
  }

  return head;
}
