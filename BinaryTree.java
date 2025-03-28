public class BinaryTree{
	private TreeNode root;
	private static class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		public TreeNode(int data){
			this.data = data;
			this.left = null;
			this.right = null;
			}
		}
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		tree.root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		System.out.println(first.left);
		System.out.println(fifth.left);
		}
}
