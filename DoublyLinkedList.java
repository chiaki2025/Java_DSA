public class DoublyLinkedList{
	private ListNode head;
	private ListNode tail;
	private static class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			this.previous = null;
			}
		}
	public static void main(String[] args){
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		dll.tail = new ListNode(4);
		dll.head.next = second;
		second.previous = dll.head;
		second.next = third;
		third.previous = second;
		third.next = dll.tail;
		(dll.tail).previous = third;
		ListNode current = dll.tail;
		while(current != null){
			System.out.println(current.data);
			current = current.previous;
			}
		}
}
		
