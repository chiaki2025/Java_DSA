import java.util.*;
public class StackPreOrder{
	private TreeNode root;
	private static class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		public TreeNode(int data){
			this.data = data;
			}
		}
	public void PreOrder(TreeNode root){
		if(root == null){
			return;
			}
		System.out.print(root.data + " ");
		PreOrder(root.left);
		PreOrder(root.right);
		}
	private ListNode head;
	private static class ListNode{
		private ListNode next;
		private TreeNode root;
		public ListNode(TreeNode root){
			this.root = root;
			}
		}
	public void push(TreeNode root){
			ListNode newNode = new ListNode(root);
			newNode.next = head;
			head = newNode;		
		}
	public boolean isEmpty(){
		if(head == null){
			return true;
			}
		return false;
		}
	public ListNode pop(){
		ListNode temp = head;
		head = head.next;
		return temp;
		}
	public void stack(TreeNode root){
		if(root == null){
			return;
			}
		push(root);
		while(!isEmpty()){
			ListNode temp = pop();
			System.out.print(temp.root.data + " ");
			if(temp.root.right != null){
				push(temp.root.right);
				}
			if(temp.root.left != null){
				push(temp.root.left);
				}
			}
		}
	public void printForward(){
		TreeNode current = root;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.right;
			System.out.print("null");
			System.out.println();
			}
		while(current != null){
			System.out.print(current.data + "<-");
			current = current.left;
			System.out.print("null");
			System.out.println();
			}
		}
	public static void main(String[] args){
		StackPreOrder tree = new StackPreOrder();
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
		tree.PreOrder(tree.root);
		System.out.println();
		tree.stack(tree.root);
		System.out.println();
		}
}
