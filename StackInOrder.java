public class StackInOrder{
	private TreeNode root;
	private static class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		private TreeNode(int data){
			this.data = data;
			}
		}
	public void InOrder(TreeNode root){
		if(root == null){
			return;
			}
		InOrder(root.left);
		System.out.print(root.data + " ");
		InOrder(root.right);
		}
	private ListNode head;
	private static class ListNode{
		private ListNode next;
		private TreeNode root;
		public ListNode(TreeNode root){
			this.root = root;
			}
		}
	public boolean isEmpty(){
		if(head == null){
			return true;
			}
		return false;
		}
	public void push(TreeNode root){
		ListNode newNode = new ListNode(root);
		newNode.next = head;
		head = newNode;
		}
	public TreeNode pop(){
		TreeNode temp = head.root;
		head = head.next;
		return temp;
		}
	public void StackTraversal(){
		TreeNode temp = root;
		while(!isEmpty() || temp != null){
			if(temp != null){
				push(temp);
				temp = temp.left;
				}
			else{
				temp = pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
				}
			}
		}
	public static void main(String[] args){
		StackInOrder tree = new StackInOrder();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		tree.InOrder(tree.root);
		System.out.println();
		tree.StackTraversal();
		}
}
