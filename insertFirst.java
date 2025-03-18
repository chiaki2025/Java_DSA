public class insertFirst{
	private ListNode head;
	public static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
		}
	public void printForward(ListNode head){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data + " ");
			current = current.next;
			}
		}
	public void insertNode(int value){
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
		}
	public static void main(String[] args){
		insertFirst sll = new insertFirst();
		sll.head = new ListNode(1234);
		sll.insertNode(10);
		sll.insertNode(20);
		sll.insertNode(30);
		sll.insertNode(40);
		sll.printForward(sll.head);
		}
}
