import java.util.Scanner;

class Nodes{
    int val;
    Nodes left;
    Nodes right;
    Nodes(int val){
        this.val=val;
    }
}
public class print_element_of_nth_level {
static int n;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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
        c.left = g;
        e.left = h;

        System.out.println(" enter n : ");
        n = sc.nextInt();
        nthlevel(a, 0);

    }
    private static void nthlevel(Nodes root,int level){
        if(root==null)return;
        if(level==n) System.out.println(root.val+" ");
        nthlevel(root.left,level+1);
        nthlevel(root.right,level+1);

    }
    private static void display(Nodes a) {
        if (a == null) return;
        System.out.print(a.val + " ");
        display(a.left);
        display(a.right);

    }



}