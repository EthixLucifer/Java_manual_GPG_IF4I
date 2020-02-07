package pg10Q;
import java.util.Vector;
//page no 68 ka 1 program ::
public class VECTOR {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        int a = 50;
        v.addElement(a);
        v.addElement(100);
        System.out.println(v.elementAt(0));

        Integer A[] = new Integer[4];
        v.copyInto(A);
        System.out.println("Capacity is ::"+ v.capacity());
        System.out.println("Size is ::"+v.size());
        System.out.println("First Element is ::"+v.firstElement());
        System.out.println("Second Element is ::"+v.lastElement());
        System.out.println("Index of "+a+" is ::"+v.indexOf(a));

        for (Object e :v)
            System.out.println(e);

        v.clear();

        for(Integer f :A)
            System.out.println(f);


    }
}
