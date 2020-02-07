package pg10Q;
//page no 66 ka X wala question::
import  java.util.Vector;
public class Vector1 {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("GPG");
        v1.add(2);
        v1.add("year");

        for (int i=0;i<v1.size();i++)
        {
            System.out.println(v1.get(i));
        }
    }
}
