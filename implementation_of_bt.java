package Binarytree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class implementation_of_bt {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(10);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(11);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        Node g=new Node(10);
        Node h=new Node(28);
        c.left =g; e.right=h;
         a.left=null;
        display(a);
    }
        private static void display (Node a){
            if (a == null) return;
            System.out.println(a.val + " ");
            display(a.left);
            display(a.right);
        }

    }

