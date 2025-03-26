public class FindMax{
	private TreeNode root;
	private static class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int data){
			this.data = data;
			}
		}
	public int MaxValue(TreeNode root){
		if(root == null){
			return Integer.MIN_VALUE;
			}
		int result = root.data;
		int left = MaxValue(root.left);
		int right = MaxValue(root.right);
		if(left > result){
			result = left;
			}
		if(right > result){
			result = right;
			}
		return result;
		}
	public static void main(String[] args){
		FindMax tree = new FindMax();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		System.out.println(tree.MaxValue(tree.root));
		}
}
