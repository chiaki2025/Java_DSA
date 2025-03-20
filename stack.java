public class stack{
	private ListNode top;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
		}
	public void push(int data){
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		}
	public int pop(){
		int result = top.data;
		top = top.next;
		return result;
		}
	public boolean isEmpty(){
		if(top == null){
			return true;
			}
		else{
			return false;
			}
		}
	public void printForward(){
		ListNode current = top;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		System.out.print("null");
		}
	public static void main(String[] args){
		stack sll = new stack();
		sll.push(1);
		sll.push(2);
		sll.push(3);
		sll.push(4);
		sll.push(5);
		sll.push(6);
		sll.push(7);
		sll.push(8);
		sll.push(9);
		sll.push(10);
		sll.push(11);
		sll.printForward();
		System.out.println();
		sll.pop();
		sll.pop();
		sll.printForward();
		while(!sll.isEmpty()){
			sll.printForward();
			System.out.println();
			sll.pop();
		}
	}
}
