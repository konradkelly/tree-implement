public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    //System.out.println(root.data);

    root.left = new TreeNode(9);
    root.right = new TreeNode(15);
    //System.out.println(root.right.data);
    
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);

    root.right.right.right = new TreeNode(22);

    preOrder(root);
  }
  public static void preOrder(TreeNode current) {
    //if null: return
    if (current == null) return;
    
    //print data
    System.out.println(current.data);
    //search left
    preOrder(current.left);
    //search right
    preOrder(current.right);
  }
}
