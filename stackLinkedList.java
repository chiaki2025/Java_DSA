public class stackLinkedList{
	private ListNode top;
	private static class ListNode{
		private ListNode next;
		private int data;
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
	public void printStack(){
		ListNode current = top;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		System.out.print("null");
		}
	public static void main(String[] args){
		stackLinkedList sll = new stackLinkedList();
		sll.push(1);
		sll.push(2);
		sll.push(3);
		sll.pop();
		sll.printStack();
		System.out.println();
		System.out.print(sll.isEmpty());
		int popValue = sll.pop();
		System.out.println(popValue);
		sll.printStack();
		}
}

