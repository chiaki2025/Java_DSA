public class charStack{
	private ListNode head;
	private static class ListNode{
		private char data;
		private ListNode next;
		public ListNode(char data){
			this.data = data;
			}
		}
	public void InsertChar(char data){
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
		}
	public void PrintForward(){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
			}
		System.out.print("null");
		}
	public static void main(String[] args){
		charStack sll = new charStack();
		sll.InsertChar('a');
		sll.InsertChar('b');
		sll.InsertChar('c');
		sll.InsertChar('d');
		sll.InsertChar('e');
		sll.InsertChar('f');
		sll.InsertChar('g');
		sll.InsertChar('h');
		sll.InsertChar('i');
		sll.InsertChar('j');
		sll.InsertChar('k');
		sll.InsertChar('l');
		sll.InsertChar('m');
		sll.InsertChar('n');
		sll.InsertChar('o');
		sll.InsertChar('p');
		sll.PrintForward();
		}
}
