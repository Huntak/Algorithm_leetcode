public class Merge_Two_Binary_Trees {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x) {
			val = x;
		}
		
		@Override
		public String toString() {
			return "[val=" + val + ", left = " + left + ", right = " + right + "]";
		}
	}
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);
		
		System.out.println(t1);
		
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);
		
		System.out.println(t2);
		
		System.out.println(mergeTrees(t1, t2));
	}
	
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode result = new TreeNode(0);
		
		if(t1 == null)
			result = t2;
		else if(t2 == null)
			result = t1;
		else{
			result.val = t1.val + t2.val;
			result.left = mergeTrees(t1.left, t2.left);
			result.right = mergeTrees(t1.right, t2.right);
		}
		
		return result;
	}
	
}