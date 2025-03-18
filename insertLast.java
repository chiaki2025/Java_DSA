public class insertLast{
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
	public void insertLast(int value){
		ListNode newNode = new ListNode(value);
		if(head == null){
			head = newNode;
			return;
		}
		ListNode current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	public static void main(String[] args){
		insertLast sll = new insertLast();
		sll.head = null;
		sll.insertLast(10);
		sll.insertLast(30);
		sll.insertLast(15);
		sll.insertLast(15);
		sll.insertLast(200);
		sll.insertLast(20);
		sll.insertLast(12);
		sll.insertLast(20);
		sll.insertLast(20);
		sll.printForward();
	}
}

