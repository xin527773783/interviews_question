import java.util.Arrays;

//根据前序，中序。构建后序

//定义一个结点类
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        val = x;
    }
    //重载同 toString方法,为打印返回后序序列
    @Override
    public String toString() {
        if (left != null && right != null) {
            return left + "," + val + "," + right ;
        }else if(left != null) {
            return left + "," + val;
        }else if(right != null) {
            return right + "," + val;
        }else {
            return "" + val;
        }
    }
}

public class ConstructBinaryTree {
    public static TreeNode reConstructTree(int[] pre, int[] in) {
        if(pre == null||in == null||pre.length == 0||in.length == 0||pre.length != in.length) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < pre.length; i++) {
            if (pre[0] == in[i]) {
                //Arrays.copyOfRange(int []original,int from,int to),复制数组从from开始，包括from，不包括to。
                //1.root.left 复制数组pre第2个元素到第i+1个元素，复制数组in第1个元素到第i-1个元素，
                root.left = reConstructTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
            }
        }
        return root;
    }
    
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

        System.out.println(reConstructTree(pre, in));
    }
}
