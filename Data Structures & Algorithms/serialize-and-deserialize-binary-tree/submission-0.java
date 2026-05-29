/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "#";
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        StringBuilder res=new StringBuilder();

        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node==null)
            {
                res.append("# ");
                continue;
            }
            res.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.equals("#") || data.isEmpty()) return null;
        Queue<TreeNode> q=new LinkedList<>();
        String[] values=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q.offer(root);

        for(int i=1;i<values.length;i++)
        {
            TreeNode parent=q.poll();
            if(!values[i].equals("#"))
            {
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                parent.left=left;
                q.offer(left);
            }
            i++;
            if(i < values.length && !values[i].equals("#")) {

                TreeNode right = new TreeNode(Integer.parseInt(values[i]));

                parent.right = right;

                q.offer(right);
            }
        }
        return root;
    }
}
