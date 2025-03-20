public class queue{
	private ListNode front;
	private ListNode rear;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
		}
	public void printElements(){
		ListNode temp = front;
		while(temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
			}
		System.out.print("null");
		}
	public boolean ifEmpty(){
		if(front == null){
			return true;
			}
		else{
			return false;
			}
		}
	public void enQueue(int value){
		ListNode temp = new ListNode(value);
		if(ifEmpty()){
				front = temp;
			}
		else{
			rear.next = temp;
			}
		rear = temp;
		}
	public int deQueue(){
		int result = front.data;
		front = front.next;
		return result;
		}
	public static void main(String[] args){
		queue sll = new queue();
		sll.enQueue(0);
		sll.enQueue(1);
		sll.enQueue(2);
		sll.enQueue(3);
		sll.enQueue(4);
		sll.enQueue(5);
		sll.deQueue();
		sll.deQueue();
		sll.printElements();
		}
}
