public class deleteFirst{
	private ListNode head;
	public static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
		}
	public int countElements(){
		ListNode current = head;
		int count = 0;
		while(current != null){
			count++;
			current = current.next;
			}
		return count;
		}
	public void insertRandom(int value, int position){
		ListNode newNode = new ListNode(value);
		if(position < 1 || position > countElements() + 1){
			return;
		}
		else if(position == 1){
			newNode.next = head;
			head = newNode;
			}
		else{
			ListNode previous = head;
			for(int i = 0; i < position - 2; i++){
				previous = previous.next;
				}
			newNode.next = previous.next;
			previous.next = newNode;
			}
		}
	public void delete(){
		if(head == null){
			return;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		}
	public void deleteLast(){
		ListNode current = head;
		for(int i = 0; i < countElements() - 2; i++){
			current = current.next;
			}
		current.next = null;
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
		deleteFirst sll = new deleteFirst();
		sll.insertRandom(10, 1);
		sll.insertRandom(20, 2);
		sll.insertRandom(30, 3);
		sll.insertRandom(40, 4);
		sll.insertRandom(50, 5);
		sll.insertRandom(60, 6);
		sll.insertRandom(70, 7);
		sll.insertRandom(2, 2);
		sll.insertRandom(3, 3);
		sll.insertRandom(4, 4);
		sll.insertRandom(8, 8);
		sll.delete();
		sll.delete();
		sll.delete();
		sll.deleteLast();
		sll.deleteLast();
		sll.printForward();
		}
}
