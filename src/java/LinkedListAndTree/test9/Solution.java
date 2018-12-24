package LinkedListAndTree.test9;


import java.util.*;

/**
 * 个人觉得这是二叉树的广度优先遍历的变形。   但还是思想受到了局限，没想出如何应对的方案。看了思路之后豁然开朗。  首先设置一个布尔值判定顺序。  我当时的卡壳应该是在：不知道读到什么时候换输出方向
 * 其实只需要得到当前层的栈的长度就可以了。 因为是数组，所以得一次性读出来。
 */

/**
 * 经过自己调试出来 ，发现需要调整一下由栈到队列的插入顺序
 */

/**
 * 思考了一下，因为这是一个层次遍历，会不停的迭代。由于题目需要对每一层的顺序有要求，故需要两个数据结构来存储。
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        Stack<TreeNode> treeNodeStack = new Stack<>();
//        Deque<TreeNode> treeNodeDeque = new ArrayDeque<>();      //双向队列     双向队列不是很会用
//        treeNodeDeque.
        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> treeNodeStack = new Stack<>();
        ArrayDeque<TreeNode> treeNodeQueue = new ArrayDeque<>();
        boolean flag = true;
        treeNodeQueue.add(root);
        while (!treeNodeStack.empty() || !treeNodeQueue.isEmpty()) {
            if (!flag) {
                List<Integer> list = new ArrayList<>();
                while (!treeNodeStack.empty()) {
                    TreeNode current = treeNodeStack.pop();
                    list.add(current.val);
                    if (current.right != null)                          //这两步是经过自己调试出来的
                        treeNodeQueue.addFirst(current.right);
                    if (current.left != null)
                        treeNodeQueue.addFirst(current.left);
                }
                flag = !flag;
                result.add(list);
            }
            else {
                List<Integer> list = new ArrayList<>();
                while (!treeNodeQueue.isEmpty()) {
                    TreeNode current = treeNodeQueue.poll();
                    list.add(current.val);
                    if (current.left != null)
                        treeNodeStack.push(current.left);
                    if (current.right != null)
                        treeNodeStack.push(current.right);
                }
                flag = !flag;
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.left = left;
        root.right = right;
        left.right = null;
        left.left = null;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        Solution solution = new Solution();
        solution.zigzagLevelOrder(root);
    }
}
