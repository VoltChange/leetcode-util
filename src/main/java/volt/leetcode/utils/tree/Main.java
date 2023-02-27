package volt.leetcode.utils.tree;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,null,null,4,5);
        TreeNode root = Tree.constructTree(input);
        System.out.println(new Solution().levelOrder(root));
    }
}