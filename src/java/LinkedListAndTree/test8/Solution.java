package LinkedListAndTree.test8;

/**
 * 递归是弱项 ， 还需要加强。这道题不会写，看了题解
 * 一开始想着从结点向上遍历父节点，，，后来忽然发现这个不可行。

 有三种情况，p q 都在左子树或右子树，p q分别在左子树和右子树，

 判断当前遍历的节点是否为空，为空返回null，节点是否等于p，是否等于q，是的话返回null。

 之后判断left 和right是否为空， 若都不为空 ，则当前root为答案，若其中一个为空，则返回另一边，为答案。
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p , q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;//p q 分别位于左右子树的情况
        return left == null ? right : left;
    }
}
