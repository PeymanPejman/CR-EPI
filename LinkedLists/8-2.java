/*
 * Time (mm): A lot 
 * Chapter/Problem: 8-2 
 * Page on EPI: 116
 * Self Evaluation: 1/3 must redo pllain reverse Linked List
 * Assumptions: s and f are valid numbers within the linkedlist
 *
 * class ListNode<T> {
 *  T data;
 *  ListNode<T> next;
 * }
 */

public static ListNode<Integer> reverseSubList(ListNode<Integer> L, int s, int f) {
  
  ListNode<Integer> head = new ListNode<Integer>(0, null);
  head.next = L;
  ListNode<Integer> slow = head;
  ListNode<Intgee > fast = head;
  int count = 1;

  while(count < s) {
    slow = slow.next;
    count++;
  }

  ListNode<Integer> curr = slow.next;
  
  while((f-s)>0) {
    ListNode<Interger> Next = curr.next;
    curr.next = slow;
    slow = curr;
    curr = Next;
    f--; 
  }

  return head.next;
}


