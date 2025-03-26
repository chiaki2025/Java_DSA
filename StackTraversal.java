public class StackTraversal{
	private TreeNode root;
	private static class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int data){
			this.data = data;
			}
		}
	private ListNode head;
	private static class ListNode{
		private TreeNode root;
		private ListNode next;
		public ListNode(TreeNode root){
			this.root = root;
			}
		}
	public void push(TreeNode root){
		ListNode newNode = new ListNode(root);
		newNode.next = head;
		head = newNode;
		}
	public TreeNode pop(){
		TreeNode result = head.root;
		head = head.next;
		return result;
		}
	public boolean isEmpty(){
		if(head == null){
			return true;
			}
		else{
			return false;
			}
		}
	public void StackPreOrder(){
		if(root == null){
			return;
			}
		push(root);
		while(!isEmpty()){
			TreeNode temp = pop();
			System.out.print(temp.data + " ");
			if(temp.right != null){
				push(temp.right);
				}
			if(temp.left != null){
				push(temp.left);
				}
			}
		}
	private ListNode front;
	private ListNode rear;
	public void enQueue(TreeNode root){
		ListNode newNode = new ListNode(root);
		if(front == null){
			front = newNode;
			}
		else{
			rear.next = newNode;
			}
		rear = newNode;
		}
	public TreeNode deQueue(){
		TreeNode temp = front.root;
		front = front.next;
		return temp;
		}
	public boolean empty(){
		if(front == null){
			return true;
			}
		else{
			return false;
			}
		}
	public void InOrder(){
		if(root == null){
			return;
			}
		enQueue(root);
		while(!empty()){
			TreeNode temp = deQueue();
			System.out.print(temp.data + " ");
			if(temp.left != null){
				enQueue(temp.left);
				}
			if(temp.right != null){
				enQueue(temp.right);
				}
			}
		}
	public static void main(String[] args){
		StackTraversal tree = new StackTraversal();
		tree.root = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		tree.root.left = second;
		tree.root.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		tree.StackPreOrder();
		System.out.println();
		tree.InOrder();
	}
}
