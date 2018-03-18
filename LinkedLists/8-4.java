/*
 * Time (mm): 18
 * Chapter/Problem: 8-4 
 * Page on EPI: 119
 * Self Evaluation: 3/3
 * Assumptions:
 *
 * class ListNode<T> {
 *  T data;
 *  ListNode<T> next;
 * }
 */

public static ListNode<Integer> findFirstOverlap(ListNode<Integer> head1, ListNode<Integer> head2) {
  if(head1 == null | head2 == null) {
    return null;
  }
  int l1Length = 0;
  ListNode<Integer> l1 = head1;
  while(l1 != null) {
    l1Length++;
    l1 = l1.next;
  }
  
  ListNode<Integer> l2 = head2;
  int L2Length = 0;
  while(l2 != null) {
    l2Length++;
    l2 = l2.next;
  }

  l1 = head1;
  l2 = head2;

  if(l1Length > l2Length) {
    l1 = advance(l1Length - l2Length, l1, l2);  
  } else if(l1Length < l2Length){
    l2 = advance(l2Length - l1Length, l2, l1);
  }

  while(l1 != null && l1 != l2) {
    l1 = l1.next;
    l2 = l2.next;
  }

  return l1 == null ?  null : l1;
}

private ListNode<Integer> advance(int len, ListNode<Integer> head, ListNode<Integer> firstNode) {
  ListNode<Integer> iter = head;

  while(head != null && head != firstNode && len>0) {
    len--;
    head = head.next;
  }

  return head;
}
