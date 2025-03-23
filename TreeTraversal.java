public class TreeTraversal{
	private TreeNode root;
	private static class TreeNode{
		private char data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(char data){
			this.data = data;
			}
		}
	public static void inOrder(TreeNode root){
		if(root == null){
			return;
			}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
		}
	public static void postOrder(TreeNode root){
		if(root == null){
			return;
			}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
		}
	public static void preOrder(TreeNode root){
		if(root == null){
			return;
			}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
		}
	public static void main(String[] args){
		TreeTraversal tree = new TreeTraversal();
		tree.root = new TreeNode('A');
		TreeNode B = new TreeNode('B');
		TreeNode C = new TreeNode('C');
		TreeNode D = new TreeNode('D');
		TreeNode E = new TreeNode('E');
		TreeNode F = new TreeNode('F');
		TreeNode G = new TreeNode('G');
		tree.root.left = B;
		tree.root.right = C;
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		inOrder(tree.root);
		System.out.println();
		preOrder(tree.root);
		System.out.println();
		postOrder(tree.root);
		System.out.println();
		}
}
