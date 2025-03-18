public class forwardTraverse{
	public static class ListNode{
		public int data;
		public ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
		}
	public ListNode head;
	public void display(){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data);
			current = current.next;
			}
		}
	public static void main(String[] args){
		forwardTraverse sll = new forwardTraverse();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		sll.head.next = second;
		second.next = third;
		sll.display();
	}
}
