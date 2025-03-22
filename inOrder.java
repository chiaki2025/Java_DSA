public class inOrder{
	private TreeNode root;
	private static class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private char data;
		public TreeNode(char data){
			this.data = data;
			}
		}
	public void inOrderTraversal(TreeNode root){
		if(root == null){
			return;
			}
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
		}
	public static void main(String[] args){
		inOrder tree = new inOrder();
		tree.root = new TreeNode('F');
		TreeNode B = new TreeNode('B');
		TreeNode A = new TreeNode('A');
		TreeNode D = new TreeNode('D');
		TreeNode C = new TreeNode('C');
		TreeNode E = new TreeNode('E');
		TreeNode G = new TreeNode('G');
		TreeNode I = new TreeNode('I');
		TreeNode H = new TreeNode('H');
		tree.root.left = B;
		tree.root.right = G;
		B.left = A;
		B.right = D;
		D.left = C;
		D.right = E;
		G.right = I;
		I.left = H;
		tree.inOrderTraversal(tree.root);
		}
}
