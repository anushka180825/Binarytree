package Binarytree;
class Nodee{
    int val;
    Nodee left;
    Nodee right;
    Nodee(int val){
        this.val=val;
    }
}
public class node_max_value_and_size_and_levels_and_height{
        public static void main(String[] args) {
            Nodee a = new Nodee(11);
            Nodee b = new Nodee(41);
            Nodee c = new Nodee(13);
            Nodee d = new Nodee(2);
            Nodee e = new Nodee(6);
            Nodee f = new Nodee(5);
            Nodee g = new Nodee(10);
            Nodee h = new Nodee(20);

            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            c.left=g;
            e.left=h;

            display(a);
            System.out.println(sum(a));
            System.out.println(max(a));
            System.out.println(size(a));
            System.out.println(levels(a));
        }
        private  static int sum(Nodee root){
            if(root==null)return 1;
            return root.val*sum(root.left)*sum(root.right);
        }
        private static int max(Nodee root){   //edit the code as per the min and max value requriment
            if(root==null)return Integer.MAX_VALUE;
            return Math.min(root.val, Math.min(max(root.left),max(root.right)));
        }
        private static int size(Nodee root){
            if(root==null)return 0;
            return 1+size(root.left)+size(root.right);

        }
        private static int levels(Nodee root){
            if(root==null) return 0;
            return 1+Math.max(levels(root.left),levels(root.right));
        }

        private static void display (Nodee a){
            if (a == null) return;
            System.out.println(a.val + " ");
            display(a.left);
            display(a.right);

        }

    }

