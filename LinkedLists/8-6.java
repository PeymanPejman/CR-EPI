/*
 * Time (mm): 
 * Chapter/Problem: 
 * Page on EPI:
 * Self Evaluation:
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
