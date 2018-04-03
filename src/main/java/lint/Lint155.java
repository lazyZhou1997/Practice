package lint;

public class Lint155 {

    public int minDepth(TreeNode root) {
        // write your code here

        if (null == root)
            return 0;

        return recursive(root, 1);
    }

    /**
     * 递归寻找最小路径
     *
     * @param treeNode 根节点
     * @param min      当前最小路径长度
     * @return
     */
    private int recursive(TreeNode treeNode, int min) {

        if (null == treeNode.left && null == treeNode.right) {
            return min;
        } else if (null == treeNode.left) {
            return recursive(treeNode.right, min + 1);
        } else if (null == treeNode.right) {
            return recursive(treeNode.left, min + 1);
        }

        int leftMin = recursive(treeNode.left, min + 1);
        int rightMin = recursive(treeNode.right, min + 1);

        return Math.min(leftMin, rightMin);
    }

}

class TreeNode {

    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

