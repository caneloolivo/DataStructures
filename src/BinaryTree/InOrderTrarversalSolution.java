package BinaryTree;

public class InOrderTrarversalSolution {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public void levelOrder(TreeNode root) {
		if(root == null)
			return;
		else {
			levelOrder(root.left);
			System.out.print(root.val);
			levelOrder(root.right);	
			System.out.println();
		}
	}	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(9);
		node.right = new TreeNode(20);
		node.right.left = new TreeNode(17);
		node.right.right = new TreeNode(7);
		
		InOrderTrarversalSolution solution 
		= new InOrderTrarversalSolution();
//		List<List<Integer>> result = 
		solution.levelOrder(node);
//		for(List<Integer> lista: result) {
//			for(int numero : lista) {
//				System.out.print(numero);
//			}
//			System.out.println();
//		}
	}
}
