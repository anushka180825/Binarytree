import javax.swing.tree.TreeNode;
import java.sql.SQLOutput;
import java.util.*;

class Node{
int val;
Node left;
Node right;
Node(int val){
    this.val=val;


}

}
public  class preorder_traversal_without_recussion {
    public static void preorder(Node root) {

        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if (root != null) st.push(root);
        while (st.size() > 0) {
            Node top = st.pop();
            System.out.print(top.val +" ");
            if (top.right != null) st.push(top.right);
            if (top.left != null) st.push(top.left);
        }
    }
    private static void postorder(Node root){
        Stack<Node> st=new Stack<>();
        if(root!=null)st.push(root);
        while (st.size()>0){
            Node top=st.pop();
            System.out.print(top.val + " ");
            if(top.left!=null)st.push(top.left);
            if(top.right!=null)st.push(top.right);
        }
    }
    private static void inorder(Node root){
        List <Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node temp=root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.size()==0)break;
                Node top =st.pop();
                ans.add(top.val);
                temp=top.right;
            }
        }


    }

        private static void display (Node a) {
        if (a == null) return;
        System.out.print(a.val + " ");
        display(a.left);
        display(a.right);


    }
        public static void main(String[]args){

            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
            Node g = new Node(7);

            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.left = f;
            f.right=g;

            preorder(a);
            System.out.println(" ");
            postorder(a);
            inorder(a);

        }
    }
