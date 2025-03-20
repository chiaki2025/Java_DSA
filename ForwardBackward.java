public class ForwardBackward{
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
	public void printForward(){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		System.out.print("null");
		}
	public void printBackward(){
		ListNode current = tail;
		while(current != null){
			System.out.print(current.data + "<-");
			current = current.previous;
			}
		System.out.print("null");
		}
	public static void main(String[] args){
		ForwardBackward dll = new ForwardBackward();
		dll.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		dll.tail = new ListNode(5);
		dll.head.next = second;
		second.previous = dll.head;
		second.next = third;
		third.previous = second;
		third.next = fourth;
		fourth.previous = third;
		fourth.next = dll.tail;
		dll.tail.previous = fourth;
		dll.printForward();
		System.out.println();
		dll.printBackward();
		}
}
