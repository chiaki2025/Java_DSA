public class insertDDL{
	private ListNode head;
	private ListNode tail;
	private static class ListNode{
		private int data;
		private ListNode previous;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.previous = null;
			this.next = null;
			}
		}
	public void insertFirst(int value){
		ListNode newNode = new ListNode(value);
		if(head == null){
			tail = newNode;
		}
		else{
			head.previous = newNode;
			}
			newNode.next = head;
			head = newNode;
		}
	public void insertLast(int value){
		ListNode newNode = new ListNode(value);
		if(head == null){
			head = newNode;
		}
		else{
			tail.next = newNode;
			}
		newNode.previous = tail;
		tail = newNode;
		}
	public void printBackward(){
		ListNode current = tail;
		while(current != null){
			System.out.print(current.data + "<-");
			current = current.previous;
			}
		System.out.print("null");
		}
	public void printForward(){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		System.out.print("null");
		}
	public static void main(String[] args){
		insertDDL ddl = new insertDDL();
		ddl.insertFirst(1);
		ddl.insertFirst(2);
		ddl.insertFirst(3);
		ddl.insertFirst(4);
		ddl.insertFirst(5);
		ddl.insertFirst(6);
		ddl.insertFirst(7);
		ddl.insertFirst(8);
		ddl.insertFirst(9);
		ddl.insertLast(-1);
		ddl.insertLast(-2);
		ddl.printBackward();
		System.out.println();
		ddl.printForward();
		}
}

		
