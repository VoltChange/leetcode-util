package volt.leetcode.utils.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {
    public static TreeNode constructTree(List<Integer> input){
        TreeNode root = null;
        //层序
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        for(Integer in:input){
            if(queue.isEmpty()){
                //根节点情况
                if(in==null)
                    root=null;
                else
                    root = new TreeNode(in);
                queue.offer(root);
            }else{
                TreeNode tmp;
                if(in==null){
                    tmp = null;
                }else{
                    tmp = new TreeNode(in);
                    queue.offer(tmp);
                }
                if(count%2==0){
                    queue.peek().left=tmp;
                }else{
                    queue.poll().right=tmp;
                }
                count++;
            }
        }
        return root;
    }
}
