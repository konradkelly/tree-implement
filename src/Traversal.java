public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(10, null, null);
    //System.out.println(root.value);
    root.left = new TreeNode<Integer>(9, null, null);
    //System.out.println(root.left.value);
    root.left.left = new TreeNode<Integer>(5, null, null);
    //System.out.println(root.left.left.value);
    root.left.right = new TreeNode<Integer>(2, null, null);
    //System.out.println(root.left.right.value);

    root.right = new TreeNode<Integer>(15, null, null);
    root.right.left = new TreeNode<Integer>(-3, null, null);
    root.right.right = new TreeNode<Integer>(5, null,null);
    root.right.right.right = new TreeNode<Integer>(22, null, null);

    TreeNode<String> stringRoot = new TreeNode<String>("hello", null, null);
    stringRoot.right = new TreeNode<String>("hello", null, null);
    stringRoot.left = new TreeNode<String>("hello", null, null);
    stringRoot.right.left = new TreeNode<String>("hello", null, null);
    stringRoot.left.right = new TreeNode<String>("hello", null, null);
    //preOrder(root);
    //postOrder(root);
    //inOrder(root);
    //printGreater(root, 7);
    System.out.println(countNodes(root));
  }

  public static int countNodes(TreeNode<?> node) {
    return node == null ? 0 : 1 + countNodes(node.left) + countNodes(node.right);
    // int leftCount = countNodes(node.left);
    // int rightCount = countNodes(node.right);
    // int overallCount = leftCount + rightCount + 1;
    // return overallCount;
  }

  public static void printGreater(TreeNode<Integer> node, int threshold) {
    if (node == null) return;
    if (node.value > threshold) {
      System.out.println(node.value);
    }
    printGreater(node.left, threshold);
    printGreater(node.right, threshold);
  }
  //Print a tree rooted at the given node in pre-order
  public static void preOrder(TreeNode<?> node) {
    if (node == null) return;
    System.out.println(node.value);
    preOrder(node.left);
    preOrder(node.right);
  }
  
  public static <T> void postOrder(TreeNode<T> node) {
    if (node == null) return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value);
  }

  public static <E> void inOrder(TreeNode<E> node) {
    if (node == null) return;
    inOrder(node.left);
    System.out.println(node.value);
    inOrder(node.right);
  }
}