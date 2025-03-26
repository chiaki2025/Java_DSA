public class Traversal{
	private TreeNode root;
	private static class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		private TreeNode(int data){
			this.data = data;
			}
		}
	public void PreOrder(TreeNode root){
		if(root == null){
			return;
			}
		else{
			System.out.print(root.data + " ");
			PreOrder(root.left);
			PreOrder(root.right);
			}
		}
	public void InOrder(TreeNode root){
		if(root == null){
			return;
			}
		else{
			InOrder(root.left);
			System.out.print(root.data + " ");
			InOrder(root.right);
			}
		}
	public void PostOrder(TreeNode root){
		if(root == null){
			return;
			}
		else{
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.print(root.data + " ");
			}
		}
	public static void main(String[] args){
		Traversal tree = new Traversal();
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
		tree.InOrder(tree.root);
		System.out.println();
		tree.PostOrder(tree.root);
		}
	}
