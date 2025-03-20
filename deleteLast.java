public class deleteLast{
	private ListNode head;
	public static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
		}
	public void insertLast(int value){
		ListNode newNode = new ListNode(value);
		if(head == null){
			head = newNode;
			}
		else{
			ListNode current = head;
			while(current.next != null){
				current = current.next;
				}
			current.next = newNode;
		}
	public ListNode deletelast(){
		if(head == null || head.next == null){
			return head;
		}
		else{
			ListNode current = head;
			ListNode previous = null;
			while(current.next != null){
				current = current.next;
				previous = current;
				}
			previous.next = null;
			return current;
			}
		}
	public void printForward(){
		ListNode current = new ListNode();
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		System.out.print("null");
		}
	public static void main(String[] args){
		deleteLast sll = new deleteLast();
		sll.head = null;
		sll.insertLast(1);
		sll.insertLast(2);
		sll.insertLast(3);
		sll.insertLast(4);
		sll.deletelast();
		sll.printForward();
		}
}
