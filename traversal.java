import java.util.LinkedList;
import java.util.Queue;

class Nodess{
    int val;
    Nodess left;
    Nodess right;
    Nodess(int val){
        this.val=val;
    }
}

public class traversal {
    public static class Pair {
        Nodess node;
        int level;

        Pair(Nodess node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        Nodess a = new Nodess(1);
        Nodess b = new Nodess(2);
        Nodess c = new Nodess(3);
        Nodess d = new Nodess(4);
        Nodess e = new Nodess(5);
        Nodess f = new Nodess(6);
        Nodess g = new Nodess(7);
        Nodess h = new Nodess(8);
        Nodess i = new Nodess(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        f.right = i;
        System.out.println("preorder");
        preorder(a);
        System.out.println();
        System.out.println("inorder");
        inorder(a);
        System.out.println();
        System.out.println("postorder");
        postorder(a);
        System.out.println();
        levelorder(a);
    }

    private static void levelorder(Nodess root) {
        int prevlevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if (root != null) q.add(new Pair(root, 0));
        while (q.size() > 0) {
            Pair front = q.remove();
            Nodess temp = front.node;
            int lvl = front.level;
            if (lvl != prevlevel) {
                System.out.println();
                prevlevel++;

            }
            System.out.print(temp.val + "  ");
            if (temp.left != null) q.add(new Pair(temp.left, lvl + 1));
            if (temp.right != null) q.add(new Pair(temp.right, lvl + 1));

        }
        System.out.println();
    }

        private static void preorder(Nodess root) {
            if (root == null) return;
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);

        }

        private static void inorder(Nodess root) {
            if (root == null) return;
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);

        }

        private static void postorder(Nodess root) {
            if (root == null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");

        }

        private static void display(Nodess a) {
            if (a == null) return;
            System.out.print(a.val + " ");
            display(a.left);
            display(a.right);


        }
    }

