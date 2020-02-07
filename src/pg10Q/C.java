package pg10Q;
//page no 83 ka X wla question::
abstract class A1
{
   int a= 5;
    abstract void add();
}
abstract class B1 extends A
{
    int b = 5;
    abstract void disp();
}
public class C extends B
{
     int c = 5;
     void add()
     {
         System.out.println("Addition is::"+(a+b+c));
     }
     void disp()
     {
         System.out.println("A = "+ a);
         System.out.println("B = "+b);
         System.out.println("C = "+c);
     }
    public static void main(String[] args) {
        C obj = new C();
        obj.add();
        obj.disp();

    }

}
