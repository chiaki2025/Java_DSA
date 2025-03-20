public class linearSearch{
	private ListNode head;
	public static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
	}
	public void insertFirst(int value){
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
		}
	public void printForward(){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		System.out.print("null");
		}
	public boolean searchElements(int searchKey){
		ListNode current = head;
		while(current != null){
			if(current.data == searchKey){
				return true;
			}
			else{
				current = current.next;
				}
			}
		return false;
		}
	public static void main(String[] args){
		linearSearch sll = new linearSearch();
		sll.insertFirst(1);
		sll.insertFirst(2);
		sll.insertFirst(3);
		sll.insertFirst(4);
		sll.insertFirst(5);
		sll.insertFirst(6);
		sll.insertFirst(7);
		sll.insertFirst(8);
		sll.insertFirst(9);
		sll.printForward();
		System.out.println(sll.searchElements(100));
		}
}
