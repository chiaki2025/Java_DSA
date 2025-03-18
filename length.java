public class length{
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
		System.out.println();
		}
	public int countElements(ListNode head){
		ListNode current = head;
		int count = 0;
		if(current == null){
			return 0;
			}
		while(current != null){
			count++;
			current = current.next;
			}
		return count;
		}
	public static void main(String[] args){
		length sll = new length();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(30);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		sll.printForward();
		System.out.println(sll.countElements(sll.head));
	}
}
