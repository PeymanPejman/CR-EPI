/*
 * Time (mm): 10
 * Chapter/Problem: 8-1 
 * Page on EPI: 115
 * Self Evaluation: 2/3 Struggled with stepping through the lists and storing the merged list. 
 * Assumptions:
 *
 * class ListNode<T> {
 *  T data;
 *  ListNode<T> next;
 * }
 */

public static ListNode<Integer> mergeLists(ListNode<Integer> L1, ListNode<Intege r> L2) {
  ListNode<Integer> head = new ListNode<Integer>(0, null);
  ListNode<Integer> ptr1 = L1; 
  ListNode<Integer> ptr2 = L2;
  ListNode<Integer> current = head; 

  while(ptr1 != null || ptr2 != null) {
    if (ptr1.data <= ptr2.data) {
      current.next = ptr1; 
      ptr1 = ptr1.next;
    } else {
      current.next = ptr2; 
      ptr2 = ptr2.next;
    }
  }

  if(ptr1 == null) {
    ptr1 = ptr2;
  }

  while (ptr1 != null) {
    current.next = ptr1;
    ptr1 = ptr1.next;
  }

  return head.next;
}
