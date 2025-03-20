public class insertDelete{
	private ListNode head;
	private static class ListNode{
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
		System.out.print("null");
		}
	public int countElements(){
		ListNode current = head;
		if(head == null){
			return 0;
			}
		int count = 0;
		while(current != null){
			count++;
			current = current.next;
			}
		return count;
		}
	public void insertRandom(int value, int position){
		if(position < 1 || position > countElements() + 1){
			return;
			}
		else if(position == 1){
			ListNode newNode = new ListNode(value);
			newNode.next = head;
			head = newNode;
			}
		else{
			ListNode newNode = new ListNode(value);
			ListNode current = head;
			for(int i = 0; i < position - 2; i++){
				current = current.next;
				}
			newNode.next = current.next;
			current.next = newNode;
			}
		}
	public void deleteRandom(int position){
		if(head  == null || head.next == null){
			return;
			}
		else if(position == 1){
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			}
		else if(1 > position || position > countElements()){
			return;
			}
		else{
			ListNode current = head;
			for(int i = 0; i < position - 2; i++){
				current = current.next;
				}
			current.next = (current.next).next;
			}
		}
	public static void main(String[] args){
		insertDelete sll = new insertDelete();
		sll.insertRandom(1, 1);
		sll.insertRandom(2, 2);
		sll.insertRandom(3, 3);
		sll.insertRandom(4, 4);
		sll.insertRandom(5, 5);
		sll.insertRandom(6, 6);
		sll.insertRandom(7, 7);
		sll.insertRandom(8, 8);
		sll.insertRandom(9, 9);
		sll.insertRandom(10, 10);
		sll.insertRandom(11, 11);
		sll.insertRandom(12, 12);
		sll.deleteRandom(9);
		sll.deleteRandom(1);
		sll.deleteRandom(10);
		sll.printForward();
		}
}
