package pg10Q;
//page no 76 ka X wla question:::
class A
{
    int a = 5;
    void display()
    {
        System.out.println("Not overridden::");
        System.out.println(a);
    }
}

class B extends A
{
    int b = 10;
    void display()
    {
        System.out.println("Overridden ::");
        System.out.println(b);
    }

}

public class OVERRIDE {
    public static void main(String[] args) {

        A obj1 = new A();
        obj1.display();

        B obj = new B();
        obj.display();


    }
}
