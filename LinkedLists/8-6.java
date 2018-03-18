/*
 * Time (mm): 2
 * Chapter/Problem: 8-6 
 * Page on EPI:
 * Self Evaluation:3/3
 * Assumptions:
 *
 * class ListNode<T> {
 *  T data;
 *  ListNode<T> next;
 * }
 */

public static voi deleteNode(ListNode<Integer> Node) {
  Node.data = Node.next.data;
  Node.next = Node.next.next;
}
