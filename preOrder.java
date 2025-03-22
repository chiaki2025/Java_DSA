public class preOrder{
	private TreeNode root;
	private static class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private char data;
		public TreeNode(char data){
			this.data = data;
			}
		}
	public static void preOrderTraversal(TreeNode root){
		if(root == null){
			return;
			}
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		}
	public static void main(String[] args){
		preOrder tree = new preOrder();
		tree.root = new TreeNode('F');
		TreeNode B = new TreeNode('B');
		TreeNode G = new TreeNode('G');		
		TreeNode A = new TreeNode('A');
		TreeNode D = new TreeNode('D');
		TreeNode I = new TreeNode('I');
		TreeNode C = new TreeNode('C');
		TreeNode E = new TreeNode('E');
		TreeNode H = new TreeNode('H');
		tree.root.left = B;
		tree.root.right = G;
		B.left = A;
		B.right = D;
		D.left = C;
		D.right = E;
		G.right = I;
		I.left = H;
		preOrderTraversal(tree.root);
		}
}
