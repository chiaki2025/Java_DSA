public class SinglyLinkedList{
	private ListNode head;
	public static class ListNode{
		private int data;
		private ListNode next;
			public ListNode(int data){
				this.data = data;
				this.next = null;
			}
	}
	public void printForward(){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		}
	public static void main(String[] args){
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		sll.head.next = second;
		second.next = third;
		sll.printForward();
	}
}
