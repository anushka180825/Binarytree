import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private static void levelorder(Nodess root){
        Queue<Nodess> q =new LinkedList<>();
        if(root!=null)q.add(root);
        while(q.size()>0){
            Nodess front = q.remove();
            System.out.print(front.val+" ");
            if(front.right!=null)q.add(front.right);
            if(front.left!=null)q.add(front.left);

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
        Nodess h =new Nodess(8);


        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        g.left = h;

        levelorder(a);


    }
}
