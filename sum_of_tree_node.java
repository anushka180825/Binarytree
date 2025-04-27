package Binarytree;
 class Nodes{
    int val;
    Nodes left;
    Nodes right;
    Nodes(int val){
        this.val=val;
    }
}
public class sum_of_tree_node {
    public static void main(String[] args) {
        Nodes a = new Nodes(1);
        Nodes b = new Nodes(41);
        Nodes c = new Nodes(3);
        Nodes d = new Nodes(2);
        Nodes e = new Nodes(6);
        Nodes f = new Nodes(5);
        Nodes g = new Nodes(10);
        Nodes h = new Nodes(20);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        c.left=g;
        e.left=h;

        display(a);
        System.out.println(sum(a));
    }
    private  static int sum(Nodes root){
        if(root==null)return 1;
        return root.val*sum(root.left)*sum(root.right);
    }
    private static void display (Nodes a){
        if (a == null) return;
        System.out.println(a.val + " ");
        display(a.left);
        display(a.right);
    }

}
