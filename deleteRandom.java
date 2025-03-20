public class deleteRandom{
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
			return;
			}
		ListNode current = head;
		while(current.next != null){
			current = current.next;
			}
		current.next = newNode;
		}
	public int countElements(){
		ListNode current = head;
		if(current == null){
			return 0;
			}
		int count = 0;
		while(current != null){
			count++;
			current = current.next;
			}
		return count;
		}
	public void deletePosition(int position){
		if(position < 1 || position > countElements()){
			return;
			}
		else if(position == 1){
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			}
		else{
			ListNode current = head;
			for(int i = 0; i < position - 2; i++){
				current = current.next;
				}
			current.next = (current.next).next;
			}
		}
	public void printElements(){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		System.out.print("null");
		}
	public static void main(String[] args){
		deleteRandom sll = new deleteRandom();
		sll.head = null;
		sll.insertLast(1);
		sll.insertLast(2);
		sll.insertLast(3);
		sll.insertLast(4);
		sll.insertLast(5);
		sll.insertLast(6);
		sll.insertLast(7);
		sll.insertLast(8);
		sll.insertLast(9);
		sll.insertLast(10);
		sll.insertLast(11);
		sll.insertLast(12);
		sll.deletePosition(3);
		sll.deletePosition(1);
		sll.deletePosition(12);
		sll.deletePosition(9);
		sll.printElements();
		}
}
