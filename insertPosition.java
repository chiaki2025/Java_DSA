public class insertPosition{
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
		System.out.print("null");
		}
	public int countElements(ListNode head){
		ListNode current = head;
		int count = 0;
		while(current != null){
			current = current.next;
			count++;
			}
		return count;
		}
	public void insertElements(int data, int position){
		ListNode newNode = new ListNode(data);
		int numberOfelements = countElements(head);
		if(position < 1 || position > numberOfelements + 1){
			return;
			}
		else if(position == 1){
			newNode.next = head;
			head = newNode;
			}
		else{
			ListNode previous = head;
			for(int i = 1; i < position - 1; i++){
				previous = previous.next;
			}
			newNode.next = previous.next;
			previous.next = newNode;
			}
		}
	public static void main(String[] args){
		insertPosition sll = new insertPosition();
		sll.head = null;
		sll.insertElements(5, 1);
		sll.insertElements(6, 2);
		sll.insertElements(7, 3);
		sll.insertElements(8, 4);
		sll.insertElements(3, 2);
		sll.insertElements(4, 3);
		sll.insertElements(10, 1);
		sll.printForward();
		}
}
